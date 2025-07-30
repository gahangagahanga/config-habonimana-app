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
public class FamilyGroup {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long familyGroupId;
    @Column(unique = true)
    private String familyGroupName;
    @OneToMany(mappedBy = "familyGroup", fetch = FetchType.LAZY)
    private List<Habonimana> habonimanaList   ;

    public String getFamilyGroupName() {
        return familyGroupName;
    }

    public void setFamilyGroupName(String familyGroupName) {
        this.familyGroupName = familyGroupName;
    }

    public List<Habonimana> getHabonimanaList() {
        return habonimanaList;
    }

    public void setHabonimanaList(List<Habonimana> habonimanaList) {
        this.habonimanaList = habonimanaList;
    }
}
