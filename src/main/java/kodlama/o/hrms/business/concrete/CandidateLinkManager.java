package kodlama.o.hrms.business.concrete;

import kodlama.o.hrms.business.abstracts.CandidateLinkService;
import kodlama.o.hrms.core.utilities.results.DataResult;
import kodlama.o.hrms.core.utilities.results.Result;
import kodlama.o.hrms.core.utilities.results.SuccessDataResult;
import kodlama.o.hrms.core.utilities.results.SuccessResult;
import kodlama.o.hrms.dataAccess.abstracts.CandidateLinkDao;
import kodlama.o.hrms.entities.concretes.CandidateLink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateLinkManager implements CandidateLinkService {
    private CandidateLinkDao candidateLinkDao;

    @Autowired
    public CandidateLinkManager(CandidateLinkDao candidateLinkDao) {
        this.candidateLinkDao = candidateLinkDao;
    }

    @Override
    public Result add(CandidateLink candidateLink) {
     candidateLinkDao.save(candidateLink);
      return new SuccessResult("added");
    }

    @Override
    public DataResult<List<CandidateLink>> getAll() {
        return new SuccessDataResult<List<CandidateLink>>(candidateLinkDao.findAll());
    }

    @Override
    public DataResult<List<CandidateLink>> getAllByCandidateId(int candidateId) {
        return new SuccessDataResult<>(candidateLinkDao.getAllByCandidateId(candidateId));

    }
}
