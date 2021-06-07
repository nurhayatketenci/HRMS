package kodlama.o.hrms.api.controller;
import kodlama.o.hrms.business.abstracts.CandidateProgrammingInformationService;
import kodlama.o.hrms.core.utilities.Results.Result;
import kodlama.o.hrms.entities.concretes.CandidateProgrammingInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/candidateprogramminginformation/")
@CrossOrigin
public class CandidateProgrammingInformationsController {
    private CandidateProgrammingInformationService candidateProgrammingInformationService;

    @Autowired
    public CandidateProgrammingInformationsController(CandidateProgrammingInformationService candidateProgrammingInformationService) {
        this.candidateProgrammingInformationService = candidateProgrammingInformationService;
    }

    @GetMapping("getall")
    ResponseEntity<?> getAll(){
        return ResponseEntity.ok(candidateProgrammingInformationService.getAll());
    }

    @PostMapping("add")
    public Result add(@RequestBody CandidateProgrammingInformation candidateProgrammingInformation){
        return candidateProgrammingInformationService.add(candidateProgrammingInformation);
    }
}