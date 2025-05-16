package com.ngarambedidace.ntigabanyaservice.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "all", types = Habonimana.class)
public interface HabonimanaProjection {
    String getFirstName();
    String getSecondName();
    String getEmail();
    String getBirthDate();
}
