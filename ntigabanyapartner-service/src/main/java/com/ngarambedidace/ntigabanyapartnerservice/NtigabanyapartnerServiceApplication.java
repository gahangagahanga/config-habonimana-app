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

            Partner partner =new Partner();
            partner.setFirstName("Christine");
            partner.setSecondName("Nsengiyumva");
            partnerRepository.save(partner);

            Partner partner1 =new Partner();
            partner1.setFirstName("Veronique");
            partner1.setSecondName("Habimana");
            partnerRepository.save(partner1);

            Partner partner2 =new Partner();
            partner2.setFirstName("Christine");
            partner2.setSecondName("Nsengiyumva");
            partnerRepository.save(partner2);




            System.out.println("Number partners is "+partnerRepository.findAll().size());
        };
    }
}
