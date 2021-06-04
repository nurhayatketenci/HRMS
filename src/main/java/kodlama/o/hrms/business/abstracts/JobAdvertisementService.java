package kodlama.o.hrms.business.abstracts;

import kodlama.o.hrms.core.utilities.Results.DataResult;
import kodlama.o.hrms.core.utilities.Results.Result;
import kodlama.o.hrms.entities.concretes.JobAdvertisement;

import java.time.LocalDate;
import java.util.List;

public interface JobAdvertisementService {
    Result add(JobAdvertisement jobAdvertisement);
    DataResult<List<JobAdvertisement>> getAll();
    DataResult<List<JobAdvertisement>> getByEmployerIdAndIsActiveTrue(int employerId);
    DataResult<List<JobAdvertisement>> getByIsActiveTrue();
    DataResult<List<JobAdvertisement>> getByApplicationDeadlineLessThanEqual(LocalDate date);
   Result jobPostingClosure(int jobAdvertisementId);



}
