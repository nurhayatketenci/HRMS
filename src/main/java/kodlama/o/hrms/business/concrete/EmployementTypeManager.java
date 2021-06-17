package kodlama.o.hrms.business.concrete;

import kodlama.o.hrms.business.abstracts.EmploymentTypeService;
import kodlama.o.hrms.core.utilities.Results.DataResult;
import kodlama.o.hrms.core.utilities.Results.Result;
import kodlama.o.hrms.core.utilities.Results.SuccessDataResult;
import kodlama.o.hrms.core.utilities.Results.SuccessResult;
import kodlama.o.hrms.dataAccess.abstracts.EmploymentTypeDao;
import kodlama.o.hrms.entities.concretes.EmploymentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployementTypeManager implements EmploymentTypeService {
    private EmploymentTypeDao employmentTypeDao;

    @Autowired
    public EmployementTypeManager(EmploymentTypeDao employmentTypeDao) {
        this.employmentTypeDao = employmentTypeDao;
    }

    @Override
    public Result add(EmploymentType employementType) {
        employmentTypeDao.save(employementType);
        return new SuccessResult("added");
    }

    @Override
    public DataResult<List<EmploymentType>> getAll() {
        return new SuccessDataResult<List<EmploymentType>>(employmentTypeDao.findAll());
    }
}
