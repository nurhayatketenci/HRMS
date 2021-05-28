package kodlama.o.hrms.api.controller;


import kodlama.o.hrms.business.abstracts.CandidateService;
import kodlama.o.hrms.core.utilities.results.DataResult;
import kodlama.o.hrms.core.utilities.results.Result;
import kodlama.o.hrms.core.utilities.results.SuccessResult;
import kodlama.o.hrms.entities.concretes.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/candidates/")
public class CandidateController {
   private CandidateService candidateService;

    @Autowired
    public CandidateController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @GetMapping("getall")
    DataResult<List<Candidate>> getAll(){
        return candidateService.getAll();
    }

    @PostMapping("add")
    public Result add(@RequestBody Candidate candidate){
        return candidateService.add(candidate);
    }
}
