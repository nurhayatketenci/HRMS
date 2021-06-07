package kodlama.o.hrms.api.controller;

import kodlama.o.hrms.business.abstracts.CandidateLinkService;
import kodlama.o.hrms.entities.concretes.CandidateLink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/candidatelink/")
@CrossOrigin
public class CandidateLinksController {
    private CandidateLinkService candidateLinkService;

    @Autowired
    public CandidateLinksController(CandidateLinkService candidateLinkService) {
        this.candidateLinkService = candidateLinkService;
    }

    @GetMapping("getall")
    ResponseEntity<?> getAll(){
        return ResponseEntity.ok(candidateLinkService.getAll());
    }

    @PostMapping("add")
    public ResponseEntity<?> add(@RequestBody CandidateLink candidateLink){
        return ResponseEntity.ok(candidateLinkService.add(candidateLink));
    }
}
