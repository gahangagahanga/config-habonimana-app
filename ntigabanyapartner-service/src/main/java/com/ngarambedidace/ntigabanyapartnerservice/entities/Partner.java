package com.ngarambedidace.ntigabanyapartnerservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Partner {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long partnerId;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = true)
    private  String secondName;
}
