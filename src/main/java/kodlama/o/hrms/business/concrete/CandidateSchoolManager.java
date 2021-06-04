package kodlama.o.hrms.business.concrete;

import kodlama.o.hrms.business.abstracts.CandidateSchoolService;
import kodlama.o.hrms.core.utilities.Results.DataResult;
import kodlama.o.hrms.core.utilities.Results.Result;
import kodlama.o.hrms.core.utilities.Results.SuccessDataResult;
import kodlama.o.hrms.core.utilities.Results.SuccessResult;
import kodlama.o.hrms.dataAccess.abstracts.CandidateSchoolDao;
import kodlama.o.hrms.entities.concretes.CandidateSchool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CandidateSchoolManager implements CandidateSchoolService {
    private CandidateSchoolDao candidateSchoolDao;

    @Autowired
    public CandidateSchoolManager(CandidateSchoolDao candidateSchoolDao) {
        this.candidateSchoolDao = candidateSchoolDao;
    }

    @Override
    public Result add(CandidateSchool candidateSchool) {
        candidateSchoolDao.save(candidateSchool);
        return new SuccessResult("added");
    }

    @Override
    public DataResult<List<CandidateSchool>> getAll() {
        return new SuccessDataResult<List<CandidateSchool>>(candidateSchoolDao.findAll());
    }

    @Override
    public DataResult<List<CandidateSchool>> getAllByCandidateIdOrderByEndDate(int candidateId) {
        return new SuccessDataResult<>(candidateSchoolDao.getAllByCandidateIdOrderByEndDate(candidateId));
    }
}
