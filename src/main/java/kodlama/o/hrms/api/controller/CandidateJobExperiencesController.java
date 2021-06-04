package kodlama.o.hrms.api.controller;

import kodlama.o.hrms.business.abstracts.CandidateJobExperienceService;
import kodlama.o.hrms.entities.concretes.CandidateJobExperience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/candidatejobexperience/")
public class CandidateJobExperiencesController {
    private CandidateJobExperienceService candidateJobExperienceService;

    @Autowired
    public CandidateJobExperiencesController(CandidateJobExperienceService candidateJobExperienceService) {
        this.candidateJobExperienceService = candidateJobExperienceService;
    }

    @GetMapping("getall")
    ResponseEntity<?> getAll(){
        return ResponseEntity.ok(candidateJobExperienceService.getAll());
    }

    @PostMapping("add")
    public ResponseEntity<?> add(@RequestBody CandidateJobExperience candidateJobExperience){
        return ResponseEntity.ok(candidateJobExperienceService.add(candidateJobExperience));
    }

    @GetMapping("getAllByCandidateIdOrderByEndDateDesc")
    ResponseEntity<?> getAllByCandidateIdOrderByEndDateDesc(int candidateId){
        return ResponseEntity.ok(candidateJobExperienceService.getAllByCandidateIdOrderByEndDateDesc(candidateId));
    }
}