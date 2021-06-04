package kodlama.o.hrms.business.concrete;

import kodlama.o.hrms.core.utilities.Adapters.MernisService;
import kodlama.o.hrms.business.abstracts.*;
import kodlama.o.hrms.business.validationRules.CommonValidatorService;
import kodlama.o.hrms.core.utilities.Business.BusinessRules;
import kodlama.o.hrms.core.utilities.Results.*;
import kodlama.o.hrms.dataAccess.abstracts.CandidateDao;
import kodlama.o.hrms.entities.DTO.CandidateDto;
import kodlama.o.hrms.entities.concretes.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateManager implements CandidateService {
    private CandidateDao candidateDao;
    private MernisService mernisService;
    private CommonValidatorService commonValidatorService;
    private CandidateImageService candidateImageService;
    private CandidateJobExperienceService candidateJobExperienceService;
    private CandidateProgrammingInformationService candidateProgrammingInformationService;
    private CandidateLinkService candidateLinkService;
    private CandidateSchoolService candidateSchoolService;
    private CandidateLanguageService candidateLanguageService;

    @Autowired
    public CandidateManager(CandidateDao candidateDao, MernisService mernisService, CommonValidatorService commonValidatorService, CandidateImageService candidateImageService, CandidateJobExperienceService candidateJobExperienceService, CandidateProgrammingInformationService candidateProgrammingInformationService, CandidateLinkService candidateLinkService, CandidateSchoolService candidateSchoolService, CandidateLanguageService candidateLanguageService) {
        this.candidateDao = candidateDao;
        this.mernisService = mernisService;
        this.commonValidatorService = commonValidatorService;
        this.candidateImageService = candidateImageService;
        this.candidateJobExperienceService = candidateJobExperienceService;
        this.candidateProgrammingInformationService = candidateProgrammingInformationService;
        this.candidateLinkService = candidateLinkService;
        this.candidateSchoolService = candidateSchoolService;
        this.candidateLanguageService = candidateLanguageService;
    }
    @Override
    public Result add(Candidate candidate) {
        Result result= BusinessRules.run(mernisService.checkIfRealPerson(candidate),checkNational(candidate.getNationalId()));
        if (!result.isSuccess()){
            return result;
        }
        candidateDao.save(candidate);
        return new SuccessResult("added");
    }

    @Override
    public Result delete(Candidate candidate) {
        candidateDao.delete(candidate);
        return new SuccessResult("deleted");
    }

    @Override
    public Result update(Candidate candidate) {
        return null;
    }

    @Override
    public DataResult<List<Candidate>> getAll() {
        return new SuccessDataResult<List<Candidate>>(candidateDao.findAll());
    }

    @Override
    public DataResult<Candidate> getById(int id) {
        return new SuccessDataResult<>(candidateDao.getById(id));
    }

    @Override
    public DataResult<CandidateDto> getResumeByCandidateId(int candidateId) {
       CandidateDto candidateDto=new CandidateDto();
       candidateDto.setCandidate(this.getById(candidateId).getData());
       candidateDto.setCandidateImages(candidateImageService.getAllByCandidateId(candidateId).getData());
       candidateDto.setCandidateLinks(candidateLinkService.getAllByCandidateId(candidateId).getData());
       candidateDto.setCandidateLanguages(candidateLanguageService.getAllByCandidateId(candidateId).getData());
       candidateDto.setCandidateSchools(candidateSchoolService.getAllByCandidateIdOrderByEndDate(candidateId).getData());
       candidateDto.setCandidateJobExperiences(candidateJobExperienceService.getAllByCandidateIdOrderByEndDateDesc(candidateId).getData());
       candidateDto.setCandidateProgrammingInformations(candidateProgrammingInformationService.getAllByCandidateId(candidateId).getData());
       return new SuccessDataResult<>(candidateDto);
    }


    private Result checkNational(String nationalId){
        if (candidateDao.findByNationalId(nationalId).isPresent()){//isPresent true ise veritabanında kayıt mevcuttur null değildir.
           return new ErrorResult("identification has been used before");
        }
        return new SuccessResult("verified");
    }
}
