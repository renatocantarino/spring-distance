package com.cantarino.cities.Resources;

import com.cantarino.cities.Models.Estado;
import com.cantarino.cities.Services.EstadoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/estados")
public class Estados {


    private final EstadoService _estadoService;
    public Estados(EstadoService estadoService) {
        this._estadoService = estadoService;
    }


    @GetMapping
    public Page<Estado> Get(Pageable page)
    {
        return _estadoService.All(page);
    }

    @GetMapping("{name}")
    public ResponseEntity<Estado> ByName(@PathVariable String name)
    {
        Optional<Estado> pais = _estadoService.FindByUF(name);

        if(pais.isEmpty()) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(pais.get());
    }
}
