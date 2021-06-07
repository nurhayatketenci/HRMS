package kodlama.o.hrms.business.abstracts;

import kodlama.o.hrms.core.utilities.Results.DataResult;
import kodlama.o.hrms.entities.concretes.Employee;

import java.util.List;

public interface EmployeeService {
    DataResult<List<Employee>> getAll();
}
