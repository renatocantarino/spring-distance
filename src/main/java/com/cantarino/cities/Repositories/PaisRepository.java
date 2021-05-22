package com.cantarino.cities.Repositories;

import com.cantarino.cities.Models.Pais;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PaisRepository extends JpaRepository<Pais, Long> {
    Optional<Pais> findByName(String name);
}
