package com.ngarambedidace.ntigabanyaservice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ConfigTestRestController {

    @Autowired
    private NtigabanyaConfigParams ntigabanyaConfigParams;
    @Autowired
    private NtigabanyaGlobalParams ntigabanyaGlobalParams;


@GetMapping("/testConfig2")
    public  NtigabanyaConfigParams configTest2(){

    return ntigabanyaConfigParams;
    }

    @GetMapping("/testConfig1")
    public  NtigabanyaGlobalParams configTest1(){

        return ntigabanyaGlobalParams;
    }

}
