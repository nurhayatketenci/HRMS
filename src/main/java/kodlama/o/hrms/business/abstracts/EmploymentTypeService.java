package kodlama.o.hrms.business.abstracts;

import kodlama.o.hrms.core.utilities.Results.DataResult;
import kodlama.o.hrms.core.utilities.Results.Result;
import kodlama.o.hrms.dataAccess.abstracts.EmploymentTypeDao;
import kodlama.o.hrms.entities.concretes.EmploymentType;

import java.util.List;

public interface EmploymentTypeService {
    Result add(EmploymentType employementType);
    DataResult<List<EmploymentType>> getAll();}
