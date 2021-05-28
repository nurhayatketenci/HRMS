package kodlama.o.hrms.business.validationRules;

import kodlama.o.hrms.core.utilities.results.Result;
import kodlama.o.hrms.entities.concretes.Candidate;

import java.time.LocalDate;

public interface CommonValidatorService {
    Result freeSpaceCheck(Candidate candidate);
    Result numberCheck(String nationalIdentity);
    Result textLength(String firstName, String lastName);
    Result checkDate(LocalDate date);
}
