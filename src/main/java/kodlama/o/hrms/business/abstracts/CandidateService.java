package kodlama.o.hrms.business.abstracts;

import kodlama.o.hrms.core.utilities.Results.DataResult;
import kodlama.o.hrms.core.utilities.Results.Result;
import kodlama.o.hrms.entities.DTO.CandidateDto;
import kodlama.o.hrms.entities.concretes.Candidate;

import java.util.List;

public interface CandidateService {
    Result add(Candidate candidate);
    Result delete(Candidate candidate);
    Result update(Candidate candidate);
    DataResult<List<Candidate>> getAll();
    DataResult<Candidate> getById(int id);
    DataResult<CandidateDto> getCandidateDtoByCandidateId(int candidateId);

}
