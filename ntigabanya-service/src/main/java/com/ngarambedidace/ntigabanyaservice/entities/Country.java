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

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public List<Habonimana> getHabonimanaList() {
        return habonimanaList;
    }

    public void setHabonimanaList(List<Habonimana> habonimanaList) {
        this.habonimanaList = habonimanaList;
    }
}
