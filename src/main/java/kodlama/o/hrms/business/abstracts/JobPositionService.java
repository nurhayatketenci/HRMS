package kodlama.o.hrms.business.abstracts;

import kodlama.o.hrms.core.utilities.Results.DataResult;
import kodlama.o.hrms.core.utilities.Results.Result;
import kodlama.o.hrms.entities.concretes.JobPosition;


import java.util.List;

public interface JobPositionService {
    Result add(JobPosition jobPosition);
    Result delete(JobPosition jobPosition);
    Result update(JobPosition jobPosition);
    DataResult<List <JobPosition>> getAll();
}
