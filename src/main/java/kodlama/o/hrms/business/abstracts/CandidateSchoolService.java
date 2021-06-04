package kodlama.o.hrms.business.abstracts;

import kodlama.o.hrms.core.utilities.Results.DataResult;
import kodlama.o.hrms.core.utilities.Results.Result;
import kodlama.o.hrms.entities.concretes.CandidateSchool;

import java.util.List;

public interface CandidateSchoolService {
    Result add(CandidateSchool candidateSchool);
    DataResult<List<CandidateSchool>> getAll();
    DataResult<List<CandidateSchool>> getAllByCandidateIdOrderByEndDate(int candidateId);
}
