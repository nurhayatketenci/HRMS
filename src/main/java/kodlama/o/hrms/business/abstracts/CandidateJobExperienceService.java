package kodlama.o.hrms.business.abstracts;

import kodlama.o.hrms.core.utilities.Results.DataResult;
import kodlama.o.hrms.core.utilities.Results.Result;
import kodlama.o.hrms.entities.concretes.CandidateJobExperience;

import java.util.List;

public interface CandidateJobExperienceService {
    Result add(CandidateJobExperience candidateJobExperience);
    DataResult<List<CandidateJobExperience>> getAll();
    DataResult<List<CandidateJobExperience>> getAllByCandidateIdOrderByEndDateDesc(int candidateId);

}
