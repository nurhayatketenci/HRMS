package kodlama.o.hrms.business.abstracts;

import kodlama.o.hrms.core.utilities.results.DataResult;
import kodlama.o.hrms.core.utilities.results.Result;
import kodlama.o.hrms.entities.concretes.JobPosition;


import java.util.List;

public interface JobPositionService {
    Result add(JobPosition jobPosition);
    Result delete(JobPosition jobPosition);
    Result update(JobPosition jobPosition);
    DataResult<List <JobPosition>> getAll();
}
