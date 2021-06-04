package kodlama.o.hrms.business.concrete;

import kodlama.o.hrms.business.abstracts.CandidateProgrammingInformationService;
import kodlama.o.hrms.core.utilities.results.DataResult;
import kodlama.o.hrms.core.utilities.results.Result;
import kodlama.o.hrms.core.utilities.results.SuccessDataResult;
import kodlama.o.hrms.core.utilities.results.SuccessResult;
import kodlama.o.hrms.dataAccess.abstracts.CandidateProgrammingInformationDao;
import kodlama.o.hrms.entities.concretes.CandidateLanguage;
import kodlama.o.hrms.entities.concretes.CandidateProgrammingInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateProgrammingInformationManager implements CandidateProgrammingInformationService {
    private CandidateProgrammingInformationDao candidateProgrammingInformationDao;
    @Autowired
    public CandidateProgrammingInformationManager(CandidateProgrammingInformationDao candidateProgrammingInformationDao) {
        this.candidateProgrammingInformationDao = candidateProgrammingInformationDao;
    }
    @Override
    public Result add(CandidateProgrammingInformation candidateProgrammingInformation) {
        candidateProgrammingInformationDao.save(candidateProgrammingInformation);
        return new SuccessResult("added");
    }

    @Override
    public DataResult<List<CandidateProgrammingInformation>> getAll() {
        return new SuccessDataResult<List<CandidateProgrammingInformation>>(candidateProgrammingInformationDao.findAll());
    }

    @Override
    public DataResult<List<CandidateProgrammingInformation>> getAllByCandidateId(int candidateId) {
        return new SuccessDataResult<>(candidateProgrammingInformationDao.getAllByCandidateId(candidateId));

    }
}
