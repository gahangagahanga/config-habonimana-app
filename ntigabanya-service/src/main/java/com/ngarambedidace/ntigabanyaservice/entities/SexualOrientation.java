package com.ngarambedidace.ntigabanyaservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SexualOrientation {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long genderId;
    @Column(unique = true)
    private Character gender;
    @Column(unique = true)
    private String genderName;
    @OneToMany(mappedBy = "gender", fetch = FetchType.LAZY)
    private List<Habonimana> habonimanaList ;
}
