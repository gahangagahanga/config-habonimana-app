package com.ngarambedidace.weddingsservice.web;

import com.ngarambedidace.weddingsservice.entities.Wedding;
import com.ngarambedidace.weddingsservice.feign.HabonimanaRestClient;
import com.ngarambedidace.weddingsservice.feign.PartnerRestClient;
import com.ngarambedidace.weddingsservice.repositories.EnfanterParRepository;
import com.ngarambedidace.weddingsservice.repositories.WeddingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeddingRestController {
   @Autowired
   private WeddingRepository weddingRepository;
    @Autowired
    private EnfanterParRepository enfanterParRepository;
    @Autowired
    private PartnerRestClient partnerRestClient;
    @Autowired
    private HabonimanaRestClient habonimanaRestClient;

    @GetMapping(path = "/weddings/{id}")
    public Wedding getWedding(@PathVariable Long id){
           Wedding wedding = weddingRepository.findById(id).get();
           wedding.setHusband(habonimanaRestClient.getHabonimanaById(wedding.getHabonimanaId()));
           wedding.setWife(partnerRestClient.getPartnerById(wedding.getPartnerId()));
           return wedding;

    }
}
