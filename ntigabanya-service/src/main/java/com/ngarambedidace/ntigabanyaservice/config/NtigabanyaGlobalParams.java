package com.ngarambedidace.ntigabanyaservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "global.params")
public record NtigabanyaGlobalParams(int p1, int p2) {
}
