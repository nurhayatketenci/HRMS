package kodlama.o.hrms.api.controller;

import kodlama.o.hrms.business.abstracts.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees/")
public class EmployeeController {
    private  EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("getall")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(employeeService.getAll());

    }
}