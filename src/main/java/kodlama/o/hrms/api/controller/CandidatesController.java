package kodlama.o.hrms.api.controller;


import kodlama.o.hrms.business.abstracts.CandidateService;
import kodlama.o.hrms.core.utilities.Results.DataResult;
import kodlama.o.hrms.core.utilities.Results.Result;
import kodlama.o.hrms.entities.DTO.CandidateDto;
import kodlama.o.hrms.entities.concretes.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/candidates/")
public class CandidatesController {
   private CandidateService candidateService;

    @Autowired
    public CandidatesController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @GetMapping("getall")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(candidateService.getAll());
    }

    @PostMapping("add")
    public Result add(@RequestBody Candidate candidate){
        return candidateService.add(candidate);
    }

    @GetMapping("getresumebycandidateid")
    public ResponseEntity<?> getResumeByCandidateId(int candidateId){
        return ResponseEntity.ok(candidateService.getCandidateDtoByCandidateId(candidateId));
    }
}
