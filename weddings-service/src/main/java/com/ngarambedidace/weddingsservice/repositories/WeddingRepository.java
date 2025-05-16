package com.ngarambedidace.weddingsservice.repositories;

import com.ngarambedidace.weddingsservice.entities.Wedding;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeddingRepository extends JpaRepository<Wedding, Long> {
}
