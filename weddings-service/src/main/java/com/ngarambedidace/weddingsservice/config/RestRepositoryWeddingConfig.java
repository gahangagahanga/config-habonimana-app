package com.ngarambedidace.weddingsservice.config;

import com.ngarambedidace.weddingsservice.entities.EnfanterPar;
import com.ngarambedidace.weddingsservice.entities.Wedding;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class RestRepositoryWeddingConfig implements RepositoryRestConfigurer {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config,
                                                     CorsRegistry corsRegistry){
        config.exposeIdsFor(Wedding.class);
        config.exposeIdsFor(EnfanterPar.class);

    }
}
