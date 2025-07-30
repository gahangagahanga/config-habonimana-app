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

    public Habonimana(String firstName, Long habonimanaId) {
        this.firstName = firstName;
        this.habonimanaId = habonimanaId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setFamilyGroup(FamilyGroup familyGroup) {
        this.familyGroup = familyGroup;
    }

    public void setGender(SexualOrientation gender) {
        this.gender = gender;
    }

    public void setHabonimanaId(Long habonimanaId) {
        this.habonimanaId = habonimanaId;
    }

}
