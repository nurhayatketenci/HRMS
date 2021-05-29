package kodlama.o.hrms.api.controller;

import kodlama.o.hrms.business.abstracts.JobAdvertisementService;
import kodlama.o.hrms.core.utilities.results.DataResult;
import kodlama.o.hrms.core.utilities.results.Result;
import kodlama.o.hrms.entities.concretes.Employer;
import kodlama.o.hrms.entities.concretes.JobAdvertisement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
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
    DataResult<List<JobAdvertisement>> getAll(){
        return jobAdvertisementService.getAll();
    }

    @PostMapping("add")
    public Result add(@RequestBody JobAdvertisement jobAdvertisement){

        return jobAdvertisementService.add(jobAdvertisement);
    }

    @GetMapping("getAllByEmployer")
    DataResult<List<JobAdvertisement>> getAllByEmployer(@RequestParam int employerId){
        return jobAdvertisementService.getByEmployerIdAndIsActiveTrue(employerId);
    }

    @GetMapping("getByIsActiveTrue")
    DataResult<List<JobAdvertisement>> getByIsActiveTrue(){
        return jobAdvertisementService.getByIsActiveTrue();
    }

    @GetMapping("getByApplicationDeadlineLessThanEqual")
    DataResult<List<JobAdvertisement>> getByApplicationDeadlineLessThanEqual(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date){
        return jobAdvertisementService.getByApplicationDeadlineLessThanEqual(date);
    }
    @GetMapping("jobPostingClosure")
     Result JobAdvertisementClosure(@RequestParam int jobAdvertisementId) {
        return jobAdvertisementService.jobPostingClosure(jobAdvertisementId);
    }



}
