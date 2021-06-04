package kodlama.o.hrms.business.abstracts;

import kodlama.o.hrms.core.utilities.results.DataResult;
import kodlama.o.hrms.core.utilities.results.Result;
import kodlama.o.hrms.entities.concretes.CandidateSchool;

import java.util.List;

public interface CandidateSchoolService {
    Result add(CandidateSchool candidateSchool);
    DataResult<List<CandidateSchool>> getAll();
    DataResult<List<CandidateSchool>> getAllByCandidateIdOrderByEndDate(int candidateId);
}
