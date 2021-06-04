package kodlama.o.hrms.business.abstracts;

import kodlama.o.hrms.core.utilities.results.DataResult;
import kodlama.o.hrms.core.utilities.results.Result;
import kodlama.o.hrms.entities.concretes.CandidateJobExperience;

import java.util.List;

public interface CandidateJobExperienceService {
    Result add(CandidateJobExperience candidateJobExperience);
    DataResult<List<CandidateJobExperience>> getAll();
    DataResult<List<CandidateJobExperience>> getAllByCandidateIdOrderByEndDateDesc(int candidateId);

}
