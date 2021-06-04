package kodlama.o.hrms.api.controller;

import kodlama.o.hrms.business.abstracts.CandidateLanguageService;
import kodlama.o.hrms.core.utilities.results.DataResult;
import kodlama.o.hrms.core.utilities.results.Result;
import kodlama.o.hrms.entities.concretes.CandidateLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/candidatelanguage/")
public class CandidateLanguageController {
    private CandidateLanguageService candidateLanguageService;

    @Autowired
    public CandidateLanguageController(CandidateLanguageService candidateLanguageService) {
        this.candidateLanguageService = candidateLanguageService;
    }

    @GetMapping("getall")
    DataResult<List<CandidateLanguage>> getAll(){
        return candidateLanguageService.getAll();
    }

    @PostMapping("add")
    public Result add(@RequestBody CandidateLanguage candidateLanguage){
        return candidateLanguageService.add(candidateLanguage);
    }
}