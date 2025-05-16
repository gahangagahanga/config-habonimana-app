package com.ngarambedidace.ntigabanyaservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Habonimana {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long habonimanaId;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = true)
    private  String secondName;
    private Date birthDate;
    @Column(unique = true)
    private String email;
    @ManyToOne
    private Country country;
    @ManyToOne
    private FamilyGroup familyGroup;
    @ManyToOne
    private SexualOrientation gender;
}
