package kodlama.o.hrms.business.concrete;

import kodlama.o.hrms.business.abstracts.EmployeeService;
import kodlama.o.hrms.core.utilities.Results.DataResult;
import kodlama.o.hrms.core.utilities.Results.SuccessDataResult;
import kodlama.o.hrms.dataAccess.abstracts.EmployeeDao;
import kodlama.o.hrms.entities.concretes.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeManager implements EmployeeService {
    private  EmployeeDao employeeDao;

    @Autowired
    public EmployeeManager(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public DataResult<List<Employee>> getAll() {
        return new SuccessDataResult<>(this.employeeDao.findAll());
    }
}
