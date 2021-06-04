package kodlama.o.hrms.core.utilities.Adapters;

import kodlama.o.hrms.core.utilities.Results.Result;
import kodlama.o.hrms.entities.concretes.Candidate;

public interface MernisService {
    Result checkIfRealPerson(Candidate candidate);
}
