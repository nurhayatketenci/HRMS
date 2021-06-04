package kodlama.o.hrms.business.abstracts;

import kodlama.o.hrms.core.utilities.Results.DataResult;
import kodlama.o.hrms.core.utilities.Results.Result;
import kodlama.o.hrms.entities.concretes.CandidateLanguage;

import java.util.List;


public interface CandidateLanguageService {
    Result add(CandidateLanguage candidateLanguage);
    DataResult<List<CandidateLanguage>> getAll();
    DataResult<List<CandidateLanguage>> getAllByCandidateId(int candidateId);

}
