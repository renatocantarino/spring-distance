package com.cantarino.cities.Resources;

import com.cantarino.cities.Models.Pais;
import com.cantarino.cities.Services.PaisService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/paises")
public class Paises {

    private final PaisService _paisService;
    public Paises(PaisService paisService) {
        this._paisService = paisService;
    }


    @GetMapping
    public Page<Pais> Get(Pageable page)
    {
        return _paisService.All(page);
    }

    @GetMapping("{name}")
    public ResponseEntity<Pais> ByName(@PathVariable String name)
    {
        Optional<Pais> pais = _paisService.FindByName(name);

        if(pais.isEmpty()) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(pais.get());
    }
}
