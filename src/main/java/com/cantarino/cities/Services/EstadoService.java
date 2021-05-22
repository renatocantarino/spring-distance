package com.cantarino.cities.Services;

import com.cantarino.cities.Models.Estado;
import com.cantarino.cities.Repositories.EstadoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EstadoService {

    private final EstadoRepository _estadoRepository;
    public EstadoService(EstadoRepository estadoRepository) {
        this._estadoRepository = estadoRepository;
    }

    public Page<Estado> All(Pageable page) {
        return _estadoRepository.findAll(page);
    }

    public Optional<Estado> FindByUF(String name) {
        return _estadoRepository.findByUf(name);
    }
}
