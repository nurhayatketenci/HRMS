package kodlama.o.hrms.business.concrete;

import kodlama.o.hrms.business.abstracts.CandidateJobExperienceService;
import kodlama.o.hrms.core.utilities.Results.DataResult;
import kodlama.o.hrms.core.utilities.Results.Result;
import kodlama.o.hrms.core.utilities.Results.SuccessDataResult;
import kodlama.o.hrms.core.utilities.Results.SuccessResult;
import kodlama.o.hrms.dataAccess.abstracts.CandidateJobExperienceDao;
import kodlama.o.hrms.entities.concretes.CandidateJobExperience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateJobExperienceManager implements CandidateJobExperienceService {
    private CandidateJobExperienceDao candidateJobExperienceDao;

    @Autowired
    public CandidateJobExperienceManager(CandidateJobExperienceDao candidateJobExperienceDao) {
        this.candidateJobExperienceDao = candidateJobExperienceDao;
    }

    @Override
    public Result add(CandidateJobExperience candidateJobExperience) {
        candidateJobExperienceDao.save(candidateJobExperience);
        return new SuccessResult("added");
    }

    @Override
    public DataResult<List<CandidateJobExperience>> getAll() {
        return new SuccessDataResult<List<CandidateJobExperience>>(candidateJobExperienceDao.findAll());
    }

    @Override
    public DataResult<List<CandidateJobExperience>> getAllByCandidateIdOrderByEndDateDesc(int candidateId) {
        return new SuccessDataResult<>(candidateJobExperienceDao.getAllByCandidateIdOrderByEndDateDesc(candidateId));
    }
}
