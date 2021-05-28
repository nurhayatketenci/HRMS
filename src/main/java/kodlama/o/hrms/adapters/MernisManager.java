package kodlama.o.hrms.adapters;

import kodlama.o.hrms.core.utilities.results.*;
import kodlama.o.hrms.core.utilities.Business.BusinessRules;
import kodlama.o.hrms.entities.concretes.Candidate;

import java.time.LocalDate;

public class MernisManager implements MernisService{

    @Override
    public Result checkIfRealPerson(Candidate candidate) {
        Result result=BusinessRules.run(freeSpaceCheck(candidate.getNationalId(), candidate.getFirstName(),candidate.getLastName(),candidate.getDateOfBirth(),candidate.getPassword()),numberCheck(candidate.getNationalId()),
                textLength(candidate.getFirstName(),candidate.getLastName()),
                checkDate(candidate.getDateOfBirth()));
        if (!result.isSuccess()){
            return result;
        }
        return new SuccessResult();
    }

    private Result freeSpaceCheck(String nationalIdentity,String firstName,String lastName,LocalDate date,String password){
        if(nationalIdentity==null||firstName==null||lastName==null||date==null||password==null){
            return new ErrorResult("can't be blank");
        }
        return new SuccessResult("validated");
    }

    private Result numberCheck(String nationalIdentity){
        if(nationalIdentity.length()!=11){
            return new ErrorResult("invalid identification number");
        }
        return new SuccessResult("validated");
    }


    private Result textLength(String firstName,String lastName){
        if(firstName.length()<2||lastName.length()<2){
            return new ErrorResult("text must consist of 2 characters");
        }
        return new SuccessResult("validated");
    }

    private Result checkDate(LocalDate date){
        if (date==null){
            return new ErrorResult("can't date blank");

        }
        if(date.isAfter(LocalDate.now())){
            return new ErrorResult("date must be before today");
        }
        return new SuccessResult("validated date");
    }


}
