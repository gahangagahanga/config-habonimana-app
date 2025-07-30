package com.ngarambedidace.ntigabanyaservice;

import com.ngarambedidace.ntigabanyaservice.config.NtigabanyaConfigParams;
import com.ngarambedidace.ntigabanyaservice.config.NtigabanyaGlobalParams;
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
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Date;

@SpringBootApplication
@EnableConfigurationProperties({NtigabanyaConfigParams.class, NtigabanyaGlobalParams.class})
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

            Country country2 = new Country();
            country2.setCountryName("Congo");
            country2.setHabonimanaList(new ArrayList<>());
            countryRepository.save(country2);

            FamilyGroup familyGroup =new FamilyGroup();
            familyGroup.setFamilyGroupName("Abanyarwanda");

            familyGroupRepository.save(familyGroup);
            FamilyGroup familyGroup1 =new FamilyGroup();
            familyGroup1.setFamilyGroupName("\"Ubundi bwoko\"");

            familyGroupRepository.save(familyGroup1);

            SexualOrientation sexualOrientation =new SexualOrientation();
            sexualOrientation.setGenderName("Male");
            sexualOrientation.setGender('M');
            sexualOrientation.setHabonimanaList(new ArrayList<>());

            sexualOrientationRepository.save(sexualOrientation);

            SexualOrientation sexualOrientation1 =new SexualOrientation();
            sexualOrientation1.setGenderName("Female");
            sexualOrientation1.setGender('F');
            sexualOrientation1.setHabonimanaList(new ArrayList<>());

            sexualOrientationRepository.save(sexualOrientation1);

            Habonimana habonimana=new Habonimana();
            habonimana.setFirstName("Joachin");
            habonimana.setSecondName("Iteka");
            habonimana.setEmail("nyaton2005@yahoo.fr");
            habonimana.setBirthDate(new Date());
            habonimana.setCountry(country1);
            habonimana.setFamilyGroup(familyGroup);
            habonimana.setGender(sexualOrientation);

            habonimanaRepository.save(habonimana);
            Habonimana habonimana1=new Habonimana();
            habonimana1.setFirstName("Ngarambe");
            habonimana1.setSecondName("Vincent");
            habonimana1.setEmail("ngarambe2005@yahoo.fr");
            habonimana1.setBirthDate(new Date());
            habonimana1.setCountry(country1);
            habonimana1.setFamilyGroup(familyGroup);
            habonimana1.setGender(sexualOrientation);

            habonimanaRepository.save(habonimana1);
            Habonimana habonimana2=new Habonimana();
            habonimana2.setFirstName("Ntadambanya");
            habonimana2.setSecondName("Didace");
            habonimana2.setEmail("ntadambanya2005@yahoo.fr");
            habonimana2.setBirthDate(new Date());
            habonimana2.setCountry(country1);
            habonimana2.setFamilyGroup(familyGroup);
            habonimana1.setGender(sexualOrientation);

            habonimanaRepository.save(habonimana2);






            System.out.println("Number Country is "+countryRepository.findAll().size());
            System.out.println("Number Gender is "+sexualOrientationRepository.findAll().size());
            System.out.println("Number FamilyGroup is "+familyGroupRepository.findAll().size());
            System.out.println("Number members is "+habonimanaRepository.findAll().size());
        };
    }
}
