package com.ngarambedidace.ntigabanyaservice.config;

import com.ngarambedidace.ntigabanyaservice.entities.Country;
import com.ngarambedidace.ntigabanyaservice.entities.FamilyGroup;
import com.ngarambedidace.ntigabanyaservice.entities.Habonimana;
import com.ngarambedidace.ntigabanyaservice.entities.SexualOrientation;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class RestRepositoryConfig implements RepositoryRestConfigurer {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config,
                                                     CorsRegistry corsRegistry){
       config.exposeIdsFor(Habonimana.class);
       config.exposeIdsFor(Country.class);
       config.exposeIdsFor(FamilyGroup.class);
       config.exposeIdsFor(SexualOrientation.class);
    }
}
