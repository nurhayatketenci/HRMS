package kodlama.o.hrms.api.controller;

import kodlama.o.hrms.business.abstracts.JobPositionService;
import kodlama.o.hrms.core.utilities.results.DataResult;
import kodlama.o.hrms.core.utilities.results.Result;
import kodlama.o.hrms.entities.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobpositions/")
public class JobPositionsController {

    private JobPositionService jobPositionService;

    @Autowired
    public JobPositionsController(JobPositionService jobPositionService) {
        this.jobPositionService = jobPositionService;
    }

    @GetMapping("getall")
    ResponseEntity<?> getAll(){

        return ResponseEntity.ok(jobPositionService.getAll());
    }

    @PostMapping("add")
    public ResponseEntity<?> add(@RequestBody JobPosition jobPosition){
       return ResponseEntity.ok(jobPositionService.add(jobPosition));
    }


}
