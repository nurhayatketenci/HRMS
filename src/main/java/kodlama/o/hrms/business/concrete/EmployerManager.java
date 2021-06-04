package kodlama.o.hrms.business.concrete;

import kodlama.o.hrms.business.abstracts.EmployerService;
import kodlama.o.hrms.business.validationRules.CommonValidatorService;
import kodlama.o.hrms.core.utilities.Business.BusinessRules;
import kodlama.o.hrms.core.utilities.Results.*;
import kodlama.o.hrms.dataAccess.abstracts.EmployerDao;
import kodlama.o.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {
    private EmployerDao employerDao;
    private CommonValidatorService commonValidatorService;

    @Autowired
    public EmployerManager(EmployerDao employerDao,CommonValidatorService commonValidatorService) {
        this.commonValidatorService=commonValidatorService;
        this.employerDao = employerDao;
    }
    @Override
    public Result add(Employer employer) {
        Result result= BusinessRules.run(commonValidatorService.checkNullEmployer(employer),checkEmailAndWebAddress(employer));
        if (!result.isSuccess()){
            return result;
        }
        employerDao.save(employer);
        return new SuccessResult("added");
    }

    @Override
    public Result delete(Employer employer) {
        employerDao.delete(employer);
        return new SuccessResult(employer.getCompanyName()+"deleted");
    }

    @Override
    public Result update(Employer employer) {
        return new SuccessResult(employer.getCompanyName()+"updated");
    }

    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult<List<Employer>>(employerDao.findAll());

    }


    public Result checkEmailAndWebAddress(Employer employer) {
        String[] result=employer.getEmail().split("@",2);
        String webAdress=employer.getWebsite();
        if (!result[1].contains(webAdress)){
            return new ErrorResult("email address not match web adress");
        }
        return new SuccessResult();
    }



}
