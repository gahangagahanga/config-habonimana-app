package com.ngarambedidace.ntigabanyaservice.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "names", types = Habonimana.class)
public interface HabonimanaProjection2 {
    String getFirstName();
    String getSecondName();
}
