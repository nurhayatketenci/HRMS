package kodlama.o.hrms.core.utilities.adapters;

import kodlama.o.hrms.core.utilities.results.Result;
import kodlama.o.hrms.entities.concretes.Candidate;

public interface MernisService {
    Result checkIfRealPerson(Candidate candidate);
}
