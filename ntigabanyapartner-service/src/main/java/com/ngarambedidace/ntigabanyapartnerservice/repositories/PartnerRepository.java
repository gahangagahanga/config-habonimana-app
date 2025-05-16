package com.ngarambedidace.ntigabanyapartnerservice.repositories;

import com.ngarambedidace.ntigabanyapartnerservice.entities.Partner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartnerRepository extends JpaRepository<Partner, Long> {
}
