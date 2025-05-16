package com.ngarambedidace.ntigabanyaservice;

import com.ngarambedidace.ntigabanyaservice.entities.Country;
import com.ngarambedidace.ntigabanyaservice.entities.FamilyGroup;
import com.ngarambedidace.ntigabanyaservice.entities.Habonimana;
import com.ngarambedidace.ntigabanyaservice.entities.SexualOrientation;
import com.ngarambedidace.ntigabanyaservice.repositories.CountryRepository;
import com.ngarambedidace.ntigabanyaservice.repositories.FamilyGroupRepository;
import com.ngarambedidace.ntigabanyaservice.repositories.HabonimanaRepository;
import com.ngarambedidace.ntigabanyaservice.repositories.SexualOrientationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Date;

@SpringBootApplication
public class NtigabanyaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NtigabanyaServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner init(CountryRepository countryRepository,
                           FamilyGroupRepository familyGroupRepository,
                           SexualOrientationRepository sexualOrientationRepository,
                           HabonimanaRepository habonimanaRepository) {
        return args -> {
            Country country1 = new Country();
            country1.setCountryName("Burundi");
            country1.setHabonimanaList(new ArrayList<>());
            countryRepository.save(country1);

            countryRepository.save(Country.builder()
                    .countryName("Congo")
                    .habonimanaList(new ArrayList<>())
                    .build());

            familyGroupRepository.save(FamilyGroup.builder()
                            .familyGroupName("Abanyarwanda")
                            .habonimanaList(new ArrayList<>())
                    .build());
            familyGroupRepository.save(FamilyGroup.builder()
                    .familyGroupName("Ubundi bwoko")
                    .habonimanaList(new ArrayList<>())
                    .build());

            sexualOrientationRepository.save(SexualOrientation.builder()
                            .genderName("Male")
                            .gender('M')
                            .habonimanaList(new ArrayList<>())
                    .build());
            sexualOrientationRepository.save(SexualOrientation.builder()
                    .genderName("Female")
                    .gender('F')
                    .habonimanaList(new ArrayList<>())
                    .build());

            habonimanaRepository.save(Habonimana.builder()
                            .firstName("Joachin")
                            .secondName("Iteka")
                            .email("nyaton2005@yahoo.fr")
                            .birthDate(new Date())
                            .country(country1)
                            .familyGroup(familyGroupRepository.findAll().getFirst())
                            .gender(sexualOrientationRepository.findAll().getFirst())

                    .build());
            habonimanaRepository.save(Habonimana.builder()
                    .firstName("Ngarambe")
                    .secondName("Didace")
                    .email("ngarambe2005@yahoo.fr")
                    .birthDate(new Date())
                    .country(country1)
                    .familyGroup(familyGroupRepository.findAll().getFirst())
                    .gender(sexualOrientationRepository.findAll().getFirst())

                    .build());

            habonimanaRepository.save(Habonimana.builder()
                    .firstName("Ntadambanya")
                    .secondName("vincent")
                    .email("ntadambanya2005@yahoo.fr")
                    .birthDate(new Date())
                    .country(country1)
                    .familyGroup(familyGroupRepository.findAll().getFirst())
                    .gender(sexualOrientationRepository.findAll().getFirst())

                    .build());



            System.out.println("Number Country is "+countryRepository.findAll().size());
            System.out.println("Number Gender is "+sexualOrientationRepository.findAll().size());
            System.out.println("Number FamilyGroup is "+familyGroupRepository.findAll().size());
            System.out.println("Number members is "+habonimanaRepository.findAll().size());
        };
    }
}
