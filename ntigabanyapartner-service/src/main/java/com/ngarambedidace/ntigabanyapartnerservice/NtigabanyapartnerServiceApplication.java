package com.ngarambedidace.ntigabanyapartnerservice;

import com.ngarambedidace.ntigabanyapartnerservice.entities.Partner;
import com.ngarambedidace.ntigabanyapartnerservice.repositories.PartnerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Date;

@SpringBootApplication
public class NtigabanyapartnerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NtigabanyapartnerServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner init(PartnerRepository partnerRepository) {
        return args -> {
            partnerRepository.save(Partner.builder()
                    .firstName("Christine")
                    .secondName("Nsengiyumva")
                    .build());

            partnerRepository.save(Partner.builder()
                    .firstName("Veronique")
                    .secondName("Nahimana")
                    .build());

            partnerRepository.save(Partner.builder()
                    .firstName("Christiane")
                    .secondName("Nsengimana")
                    .build());



            System.out.println("Number partners is "+partnerRepository.findAll().size());
        };
    }
}
