package com.cantarino.cities.Repositories;

import com.cantarino.cities.Models.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EstadoRepository extends JpaRepository<Estado, Long> {

    Optional<Estado> findByUf(String uf);
}
