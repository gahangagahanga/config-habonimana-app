package com.ngarambedidace.weddingsservice;

import com.ngarambedidace.weddingsservice.entities.EnfanterPar;
import com.ngarambedidace.weddingsservice.entities.Wedding;
import com.ngarambedidace.weddingsservice.feign.HabonimanaRestClient;
import com.ngarambedidace.weddingsservice.feign.PartnerRestClient;
import com.ngarambedidace.weddingsservice.model.Habonimana;
import com.ngarambedidace.weddingsservice.model.Partner;
import com.ngarambedidace.weddingsservice.repositories.EnfanterParRepository;
import com.ngarambedidace.weddingsservice.repositories.WeddingRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.*;

import static org.hibernate.internal.util.collections.ArrayHelper.forEach;

@SpringBootApplication
@EnableFeignClients
public class WeddingsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeddingsServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner init(WeddingRepository weddingRepository,
                           EnfanterParRepository enfanterParRepository,
                           PartnerRestClient partnerRestClient,
                           HabonimanaRestClient habonimanaRestClient) {
        return args -> {
            List<Habonimana> allHabonimanas = habonimanaRestClient.getAllHabonimanas().getContent().stream().toList();
            List<Partner> allPartners = partnerRestClient.getAllPartners().getContent().stream().toList();

            allHabonimanas.forEach(habonimana ->{
                Wedding wedding=Wedding.builder()
                        .weddingDate(new Date())
                        .habonimanaId(habonimana.getHabonimanaId())
                        .habonimanaKidsList(new ArrayList<>())
                        .partnerId(allPartners.get(new Random().nextInt(allPartners.size())).getPartnerId())
                        .build();
                weddingRepository.save(wedding);

                EnfanterPar enfanterPar = EnfanterPar.builder()
                        .enfanterParDate(new Date())
                        .parents(wedding)
                        .habonimanaId(allHabonimanas.get(new Random().nextInt(allHabonimanas.size())).getHabonimanaId())
                        .build();
                enfanterParRepository.save(enfanterPar);

            } );


        };
        }
    }

