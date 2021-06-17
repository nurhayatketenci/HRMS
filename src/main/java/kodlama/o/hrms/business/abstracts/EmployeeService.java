package kodlama.o.hrms.business.abstracts;

import kodlama.o.hrms.core.utilities.Results.DataResult;
import kodlama.o.hrms.core.utilities.Results.Result;
import kodlama.o.hrms.entities.concretes.Employee;

import java.util.List;

public interface EmployeeService {
    Result add(Employee employee);
    DataResult<List<Employee>> getAll();
}
