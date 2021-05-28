package kodlama.o.hrms.business.abstracts;

import kodlama.o.hrms.core.utilities.results.DataResult;
import kodlama.o.hrms.core.utilities.results.Result;
import kodlama.o.hrms.entities.DTO.RegisterCandidateDto;
import kodlama.o.hrms.entities.concretes.Candidate;
import kodlama.o.hrms.entities.concretes.JobPosition;

import java.util.List;

public interface CandidateService {
    Result add(Candidate candidate);
    Result delete(Candidate candidate);
    Result update(Candidate candidate);
    DataResult<List<Candidate>> getAll();

}
