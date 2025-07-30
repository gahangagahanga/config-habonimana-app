package com.ngarambedidace.ntigabanyaservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "ntigabanya.params")
public record NtigabanyaConfigParams(int x, int y) {
}
