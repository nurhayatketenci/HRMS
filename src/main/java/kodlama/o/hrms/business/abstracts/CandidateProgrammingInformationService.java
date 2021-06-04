package kodlama.o.hrms.business.abstracts;

import kodlama.o.hrms.core.utilities.results.DataResult;
import kodlama.o.hrms.core.utilities.results.Result;
import kodlama.o.hrms.entities.concretes.CandidateProgrammingInformation;

import java.util.List;

public interface CandidateProgrammingInformationService {
    Result add(CandidateProgrammingInformation candidateProgrammingInformation);
    DataResult<List<CandidateProgrammingInformation>> getAll();
    DataResult<List<CandidateProgrammingInformation>> getAllByCandidateId(int candidateId);

}
