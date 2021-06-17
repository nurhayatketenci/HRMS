package kodlama.o.hrms.business.abstracts;

import kodlama.o.hrms.core.utilities.Results.DataResult;
import kodlama.o.hrms.core.utilities.Results.Result;
import kodlama.o.hrms.entities.concretes.JobAdvertisementConfirmation;

import java.util.List;

public interface JobAdvertisementConfirmationService {
    Result add(JobAdvertisementConfirmation jobAdvertisementConfirmation);
    DataResult<List<JobAdvertisementConfirmation>> getAll();
    DataResult<List<JobAdvertisementConfirmation>> getByIsConfirmTrue();
    Result toggleConfirmation(int jobAdvertisementConfirmationId);


}
