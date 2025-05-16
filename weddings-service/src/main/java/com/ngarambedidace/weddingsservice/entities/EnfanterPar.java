package com.ngarambedidace.weddingsservice.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ngarambedidace.weddingsservice.model.Habonimana;
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
public class EnfanterPar {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long enfanterParId;
    private Date enfanterParDate;
   // @Column(unique = true)
    private Long habonimanaId;
    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Wedding parents;
    @Transient
    private Habonimana kid;

}
