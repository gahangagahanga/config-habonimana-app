package com.ngarambedidace.weddingsservice.feign;

import com.ngarambedidace.weddingsservice.model.Habonimana;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ntigabanya-service")
public interface HabonimanaRestClient {
    @GetMapping("habonimanas/{id}")
    Habonimana getHabonimanaById(@PathVariable Long id);

    @GetMapping("habonimanas")
    PagedModel<Habonimana> getAllHabonimanas();
}
