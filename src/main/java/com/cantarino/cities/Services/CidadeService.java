package com.cantarino.cities.Services;


import com.cantarino.cities.Models.Cidade;
import com.cantarino.cities.Repositories.CidadeRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;



@Service
public class CidadeService {

    private final CidadeRepository _cidadeRepository;
    private final double MedidaKm = 1.6;
    public CidadeService(CidadeRepository cidadeRepository) {
        this._cidadeRepository = cidadeRepository;
    }

    public Page<Cidade> All(Pageable page)
    {
        return _cidadeRepository.findAll(page);
    }

    public Double distanceByPointsInKM(Long cidade1, Long cidade2) {
        return _cidadeRepository.distanceByPoints(cidade1, cidade2) ;
    }
}
