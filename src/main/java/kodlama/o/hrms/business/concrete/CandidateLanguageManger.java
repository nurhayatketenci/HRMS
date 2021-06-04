package kodlama.o.hrms.business.concrete;

import kodlama.o.hrms.business.abstracts.CandidateLanguageService;
import kodlama.o.hrms.core.utilities.Results.DataResult;
import kodlama.o.hrms.core.utilities.Results.Result;
import kodlama.o.hrms.core.utilities.Results.SuccessDataResult;
import kodlama.o.hrms.core.utilities.Results.SuccessResult;
import kodlama.o.hrms.dataAccess.abstracts.CandidateLanguageDao;
import kodlama.o.hrms.entities.concretes.CandidateLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateLanguageManger implements CandidateLanguageService {

    private CandidateLanguageDao candidateLanguageDao;

    @Autowired
    public CandidateLanguageManger(CandidateLanguageDao candidateLanguageDao) {
        this.candidateLanguageDao = candidateLanguageDao;
    }

    @Override
    public Result add(CandidateLanguage candidateLanguage) {
        candidateLanguageDao.save(candidateLanguage);
        return new SuccessResult("added");
    }

    @Override
    public DataResult<List<CandidateLanguage>> getAll() {
        return new SuccessDataResult<List<CandidateLanguage>>(candidateLanguageDao.findAll());
    }

    @Override
    public DataResult<List<CandidateLanguage>> getAllByCandidateId(int candidateId) {
        return new SuccessDataResult<>(candidateLanguageDao.getAllByCandidateId(candidateId));

    }
}
