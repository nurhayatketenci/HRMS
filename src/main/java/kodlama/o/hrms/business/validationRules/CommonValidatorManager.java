package kodlama.o.hrms.business.validationRules;

import com.google.common.base.Strings;
import kodlama.o.hrms.core.utilities.results.ErrorResult;
import kodlama.o.hrms.core.utilities.results.Result;
import kodlama.o.hrms.core.utilities.results.SuccessResult;
import kodlama.o.hrms.entities.concretes.Candidate;
import kodlama.o.hrms.entities.concretes.Employer;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CommonValidatorManager implements CommonValidatorService {
    @Override
    public Result freeSpaceCheck(Candidate candidate) {
        if (!Strings.isNullOrEmpty(candidate.getFirstName()) || Strings.isNullOrEmpty(candidate.getLastName()) || Strings.isNullOrEmpty(candidate.getNationalId())
                || Strings.isNullOrEmpty(candidate.getEmail()) || Strings.isNullOrEmpty(candidate.getPassword())) {
            return new ErrorResult("can't be blank");
        }
        return new SuccessResult("validated");
    }
    @Override
    public Result numberCheck(String nationalIdentity) {
        if (nationalIdentity.length() != 11) {
            return new ErrorResult("invalid identification number");
        }
        return new SuccessResult("validated");
    }

    @Override
    public Result textLength(String firstName, String lastName) {
        if (firstName.length() < 2 || lastName.length() < 2) {
            return new ErrorResult("text must consist of 2 characters");
        }
        return new SuccessResult("validated");
    }
    @Override
    public Result checkDate(LocalDate date) {
        if (date == null) {
            return new ErrorResult("can't date blank");

        }
        if (date.isAfter(LocalDate.now())) {
            return new ErrorResult("date must be before today");
        }
        return new SuccessResult("validated date");
    }
    @Override
    public Result checkNullEmployer(Employer employer) {
        if (employer.getWebsite()==null||employer.getCompanyName()==null||
                employer.getEmail()==null ||employer.getPhoneNumber()==null){
            return new ErrorResult("no field can be passed empty");
        }
        return new SuccessResult();
    }


}
