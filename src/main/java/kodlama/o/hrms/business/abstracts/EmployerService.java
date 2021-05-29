package kodlama.o.hrms.business.abstracts;

import kodlama.o.hrms.core.utilities.results.DataResult;
import kodlama.o.hrms.core.utilities.results.Result;
import kodlama.o.hrms.entities.concretes.Employer;

import java.util.List;

public interface EmployerService {
    Result add(Employer employer);
    Result delete(Employer employer);
    Result update(Employer employer);
    DataResult<List<Employer>> getAll();



}
