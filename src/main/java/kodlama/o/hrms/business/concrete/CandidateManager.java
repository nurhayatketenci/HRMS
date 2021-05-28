package kodlama.o.hrms.business.concrete;

import kodlama.o.hrms.adapters.MernisManager;
import kodlama.o.hrms.adapters.MernisService;
import kodlama.o.hrms.business.abstracts.CandidateService;
import kodlama.o.hrms.core.utilities.Business.BusinessRules;
import kodlama.o.hrms.core.utilities.results.*;
import kodlama.o.hrms.dataAccess.abstracts.CandidateDao;
import kodlama.o.hrms.entities.DTO.RegisterCandidateDto;
import kodlama.o.hrms.entities.concretes.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateManager implements CandidateService {
    private CandidateDao candidateDao;
    private MernisService mernisService = new MernisManager();

    @Autowired
    public CandidateManager(CandidateDao candidateDao) {
        this.candidateDao = candidateDao;
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


    private Result checkNational(String nationalId){
        if (candidateDao.findByNationalId(nationalId).isPresent()){//isPresent true ise veritabanında kayıt mevcuttur null değildir.
           return new ErrorResult("identification has been used before");
        }
        return new SuccessResult("verified");
    }
}
