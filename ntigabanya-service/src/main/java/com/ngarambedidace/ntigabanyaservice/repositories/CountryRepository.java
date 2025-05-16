package com.ngarambedidace.ntigabanyaservice.repositories;

import com.ngarambedidace.ntigabanyaservice.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
