package kodlama.o.hrms.api.controller;

import kodlama.o.hrms.business.abstracts.CandidateSchoolService;
import kodlama.o.hrms.business.abstracts.EmployeeService;
import kodlama.o.hrms.entities.concretes.CandidateSchool;
import kodlama.o.hrms.entities.concretes.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee/")
@CrossOrigin
public class EmployeeController {
    private EmployeeService employeeService;
    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("getall")
    ResponseEntity<?> getAll(){
        return ResponseEntity.ok(employeeService.getAll());
    }

    @PostMapping("add")
    public ResponseEntity<?> add(@RequestBody Employee employee){
        return ResponseEntity.ok(employeeService.add(employee));
    }

}
