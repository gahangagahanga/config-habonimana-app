package com.ngarambedidace.weddingsservice.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
public class Habonimana {
    private Long habonimanaId;
    private String firstName;
    private  String secondName;
    private Date birthDate;
    private String email;
}
