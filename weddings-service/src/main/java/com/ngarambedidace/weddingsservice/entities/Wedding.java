package com.ngarambedidace.weddingsservice.entities;

import com.ngarambedidace.weddingsservice.model.Habonimana;
import com.ngarambedidace.weddingsservice.model.Partner;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Wedding {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long weddingId;
    private Date weddingDate;
    private Long habonimanaId;
    private Long partnerId;
    @OneToMany(mappedBy = "parents")
    private List<EnfanterPar> habonimanaKidsList;
    @Transient private Habonimana husband;
    @Transient private Partner wife;
}
