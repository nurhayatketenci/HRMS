package kodlama.o.hrms.api.controller;

import kodlama.o.hrms.business.abstracts.EmploymentTypeService;
import kodlama.o.hrms.entities.concretes.EmploymentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employmenttype/")
@CrossOrigin
public class EmploymentTypesController {
    private EmploymentTypeService employmentTypeService;

    @Autowired
    public EmploymentTypesController(EmploymentTypeService employmentTypeService) {
        this.employmentTypeService = employmentTypeService;
    }
    @GetMapping("getall")
    ResponseEntity<?> getAll(){
        return ResponseEntity.ok(employmentTypeService.getAll());
    }

    @PostMapping("add")
    public ResponseEntity<?> add(@RequestBody EmploymentType employmentType){
        return ResponseEntity.ok(employmentTypeService.add(employmentType));
    }
}
