package kodlama.o.hrms.api.controller;


import kodlama.o.hrms.business.abstracts.EmployerService;
import kodlama.o.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employers/")
@CrossOrigin
public class EmployersController {
   private EmployerService employerService;

 @Autowired
    public EmployersController(EmployerService employerService) {
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
