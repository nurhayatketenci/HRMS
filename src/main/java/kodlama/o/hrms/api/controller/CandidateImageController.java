package kodlama.o.hrms.api.controller;

import kodlama.o.hrms.business.abstracts.CandidateImageService;
import kodlama.o.hrms.entities.concretes.Candidate;
import kodlama.o.hrms.entities.concretes.CandidateImage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequestMapping("/api/candidateimage/")
public class CandidateImageController {
    private CandidateImageService candidateImageService;

    @Autowired
    public CandidateImageController(CandidateImageService candidateImageService) {
        this.candidateImageService = candidateImageService;
    }

    @GetMapping("getall")
    ResponseEntity<?> getAll(){
        return ResponseEntity.ok(candidateImageService.getAll());
    }


    @PostMapping("add")
    public ResponseEntity<?> addCandidateImage(@RequestBody MultipartFile file, @RequestParam int candidateId){
        Candidate candidate = new Candidate();
        CandidateImage candidateImage = new CandidateImage();
        candidate.setId(candidateId);
        candidateImage.setCandidate(candidate);
        return ResponseEntity.ok(this.candidateImageService.add(candidateImage, file));
    }
}
