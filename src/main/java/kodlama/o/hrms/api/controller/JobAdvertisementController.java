package kodlama.o.hrms.api.controller;

import kodlama.o.hrms.business.abstracts.JobAdvertisementService;
import kodlama.o.hrms.core.utilities.results.DataResult;
import kodlama.o.hrms.core.utilities.results.Result;
import kodlama.o.hrms.entities.concretes.Employer;
import kodlama.o.hrms.entities.concretes.JobAdvertisement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/jobadvertisement/")
public class JobAdvertisementController {
    private JobAdvertisementService jobAdvertisementService;

    @Autowired
    public JobAdvertisementController(JobAdvertisementService jobAdvertisementService) {
        this.jobAdvertisementService = jobAdvertisementService;
    }
    @GetMapping("getall")
    ResponseEntity<?> getAll(){
        return ResponseEntity.ok(jobAdvertisementService.getAll());
    }

    @PostMapping("add")
    public ResponseEntity<?> add(@RequestBody JobAdvertisement jobAdvertisement){

        return ResponseEntity.ok(jobAdvertisementService.add(jobAdvertisement));
    }

    @GetMapping("getAllByEmployer")
    ResponseEntity<?> getAllByEmployer(@RequestParam int employerId){
        return ResponseEntity.ok(jobAdvertisementService.getByEmployerIdAndIsActiveTrue(employerId));
    }

    @GetMapping("getByIsActiveTrue")
    ResponseEntity<?> getByIsActiveTrue(){
        return ResponseEntity.ok(jobAdvertisementService.getByIsActiveTrue());
    }

    @GetMapping("getByApplicationDeadlineLessThanEqual")
    ResponseEntity<?> getByApplicationDeadlineLessThanEqual(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date){
        return ResponseEntity.ok(jobAdvertisementService.getByApplicationDeadlineLessThanEqual(date));
    }
    @GetMapping("jobPostingClosure")
     ResponseEntity<?> JobAdvertisementClosure(@RequestParam int jobAdvertisementId) {
        return ResponseEntity.ok(jobAdvertisementService.jobPostingClosure(jobAdvertisementId));
    }



}
