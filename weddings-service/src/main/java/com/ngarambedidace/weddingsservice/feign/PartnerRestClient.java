package com.ngarambedidace.weddingsservice.feign;

import com.ngarambedidace.weddingsservice.model.Habonimana;
import com.ngarambedidace.weddingsservice.model.Partner;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ntigabanyapartner-service")
public interface PartnerRestClient {
    @GetMapping("partners/{id}")
    Partner getPartnerById(@PathVariable Long id);

    @GetMapping("partners")
    PagedModel<Partner> getAllPartners();
}
