package kodlama.o.hrms.api.controller;
import kodlama.o.hrms.business.abstracts.CandidateSchoolService;
import kodlama.o.hrms.entities.concretes.CandidateSchool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/candidateSchools/")
@CrossOrigin
public class CandidateSchoolsController {
    private CandidateSchoolService candidateSchoolService;

    @Autowired
    public CandidateSchoolsController(CandidateSchoolService candidateSchoolService) {
        this.candidateSchoolService = candidateSchoolService;
    }
    @GetMapping("getall")
    ResponseEntity<?> getAll(){
        return ResponseEntity.ok(candidateSchoolService.getAll());
    }

    @PostMapping("add")
    public ResponseEntity<?> add(@RequestBody CandidateSchool candidateSchool){
        return ResponseEntity.ok(candidateSchoolService.add(candidateSchool));
    }

    @GetMapping("getAllByCandidateIdOrderByEndDate")
    ResponseEntity<?> getAllByCandidateIdOrderByEndDate(int candidateId){
        return ResponseEntity.ok(candidateSchoolService.getAllByCandidateIdOrderByEndDate(candidateId));
    }
}
