package kodlama.o.hrms.core.utilities.Adapters;

import kodlama.o.hrms.business.validationRules.CommonValidatorService;
import kodlama.o.hrms.core.utilities.Results.*;
import kodlama.o.hrms.core.utilities.Business.BusinessRules;
import kodlama.o.hrms.entities.concretes.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MernisManager implements MernisService {

    private CommonValidatorService commonValidatorService;

    @Autowired
    public MernisManager(CommonValidatorService commonValidatorService) {
        this.commonValidatorService = commonValidatorService;
    }

    @Override
    public Result checkIfRealPerson(Candidate candidate) {
        Result result = BusinessRules.run(commonValidatorService.freeSpaceCheck(candidate),
                commonValidatorService.checkDate(candidate.getDateOfBirth()));
        if (!result.isSuccess()) {
            return result;
        }
        return new SuccessResult();
    }


}
