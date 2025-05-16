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
public class Country {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long countryId;
    @Column(unique = true)
    private String countryName;
    @OneToMany(mappedBy = "country", fetch = FetchType.LAZY)
    private List<Habonimana> habonimanaList ;
}
