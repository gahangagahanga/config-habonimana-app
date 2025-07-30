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

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public String getGenderName() {
        return genderName;
    }

    public void setGenderName(String genderName) {
        this.genderName = genderName;
    }

    public List<Habonimana> getHabonimanaList() {
        return habonimanaList;
    }

    public void setHabonimanaList(List<Habonimana> habonimanaList) {
        this.habonimanaList = habonimanaList;
    }
}
