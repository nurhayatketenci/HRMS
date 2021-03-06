package kodlama.o.hrms.api.controller;

import kodlama.o.hrms.business.abstracts.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/cities/")
@CrossOrigin
public class CitiesController {
    private CityService cityService;

    @Autowired
    public CitiesController(CityService cityService) {
        this.cityService = cityService;
    }
    @GetMapping("getall")
    ResponseEntity<?> getAll(){

        return ResponseEntity.ok(cityService.getAll());
    }
}
