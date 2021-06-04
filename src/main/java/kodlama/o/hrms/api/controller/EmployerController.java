package kodlama.o.hrms.api.controller;


import kodlama.o.hrms.business.abstracts.EmployerService;
import kodlama.o.hrms.core.utilities.results.DataResult;
import kodlama.o.hrms.core.utilities.results.Result;
import kodlama.o.hrms.entities.concretes.Candidate;
import kodlama.o.hrms.entities.concretes.Employer;
import kodlama.o.hrms.entities.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.util.List;

@RestController
@RequestMapping("/api/employers/")
public class EmployerController {
   private EmployerService employerService;

 @Autowired
    public EmployerController(EmployerService employerService) {
        this.employerService = employerService;
    }
    @GetMapping("getall")
    ResponseEntity<?> getAll(){

     return ResponseEntity.ok(employerService.getAll());
    }

    @PostMapping("add")
    public ResponseEntity<?> add(@RequestBody Employer employer){
       return ResponseEntity.ok(employerService.add(employer));
    }

}
