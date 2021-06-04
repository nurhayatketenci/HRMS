package kodlama.o.hrms.business.abstracts;

import kodlama.o.hrms.core.utilities.Results.DataResult;
import kodlama.o.hrms.core.utilities.Results.Result;
import kodlama.o.hrms.entities.concretes.CandidateLink;

import java.util.List;

public interface CandidateLinkService {
    Result add(CandidateLink candidateLink);
    DataResult<List<CandidateLink>> getAll();
    DataResult<List<CandidateLink>> getAllByCandidateId(int candidateId);

}
