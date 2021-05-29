package kodlama.o.hrms.api.controller;

import kodlama.o.hrms.business.abstracts.CityService;
import kodlama.o.hrms.core.utilities.results.DataResult;
import kodlama.o.hrms.entities.concretes.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cities/")
public class CityController {
    private CityService cityService;

    @Autowired
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }
    @GetMapping("getall")
    DataResult<List<City>> getAll(){

        return cityService.getAll();
    }
}
