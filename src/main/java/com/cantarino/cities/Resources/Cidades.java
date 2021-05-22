package com.cantarino.cities.Resources;


import com.cantarino.cities.Models.Cidade;
import com.cantarino.cities.Services.CidadeService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/cidades")
public class Cidades {

    private final CidadeService _cidadeService;
    public Cidades(CidadeService cidadeService) {
        this._cidadeService = cidadeService;
    }


    @GetMapping
    public Page<Cidade> Get(Pageable page)
    {
        return _cidadeService.All(page);
    }


    @GetMapping("/distance-between")
    public Double byPoints(@RequestParam(name = "from") final Long city1,
                           @RequestParam(name = "to") final Long city2) {

        return _cidadeService.distanceByPointsInKM(city1, city2);
    }
}
