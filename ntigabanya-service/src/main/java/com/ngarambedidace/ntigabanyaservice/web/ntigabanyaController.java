package com.ngarambedidace.ntigabanyaservice.web;

import com.ngarambedidace.ntigabanyaservice.entities.Habonimana;
import com.ngarambedidace.ntigabanyaservice.repositories.HabonimanaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ntigabanyaController {
    @Autowired
    private HabonimanaRepository habonimanaRepository;

    @QueryMapping
    public List<Habonimana> habonimanas(){
        return habonimanaRepository.findAll();

    }
    @QueryMapping
    public Habonimana habonimana(@Argument Long id){
        return habonimanaRepository.findById(id).orElseThrow();

    }

}
