package kodlama.o.hrms.api.controller;

import kodlama.o.hrms.business.abstracts.JobAdvertisementConfirmationService;
import kodlama.o.hrms.entities.concretes.JobAdvertisementConfirmation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/jobadvertisementconfirmation/")
@CrossOrigin
public class JobAdvertisementConfirmationsController {
    private JobAdvertisementConfirmationService jobAdvertisementConfirmationService;
    @Autowired
    public JobAdvertisementConfirmationsController(JobAdvertisementConfirmationService jobAdvertisementConfirmationService) {
        this.jobAdvertisementConfirmationService = jobAdvertisementConfirmationService;
    }
    @GetMapping("getall")
    ResponseEntity<?> getAll(){
        return ResponseEntity.ok(jobAdvertisementConfirmationService.getAll());
    }

    @PostMapping("add")
    public ResponseEntity<?> add(@RequestBody JobAdvertisementConfirmation jobAdvertisementConfirmation){
        return ResponseEntity.ok(jobAdvertisementConfirmationService.add(jobAdvertisementConfirmation));
    }
    @GetMapping("getByIsConfirmTrue")
    ResponseEntity<?> getByIsConfirmTrue(){
        return ResponseEntity.ok(jobAdvertisementConfirmationService.getByIsConfirmTrue());
    }
    @GetMapping("toggleConfirmation")
    ResponseEntity<?> isConfirmation(int id){
        return ResponseEntity.ok(jobAdvertisementConfirmationService.toggleConfirmation(id));
    }

}
