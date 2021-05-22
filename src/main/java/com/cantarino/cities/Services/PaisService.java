package com.cantarino.cities.Services;


import com.cantarino.cities.Models.Pais;
import com.cantarino.cities.Repositories.PaisRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class PaisService {

    private final PaisRepository _paisRepository;
    public PaisService(PaisRepository _paisRepository) {
        this._paisRepository = _paisRepository;
    }

    public Page<Pais> All(Pageable page)
    {
        return _paisRepository.findAll(page);
    }

    public Optional<Pais> FindByName(String name) {
        return  _paisRepository.findByName(name);
    }
}
