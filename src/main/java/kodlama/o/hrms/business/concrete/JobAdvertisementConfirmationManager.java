package kodlama.o.hrms.business.concrete;

import kodlama.o.hrms.business.abstracts.JobAdvertisementConfirmationService;
import kodlama.o.hrms.core.utilities.Results.DataResult;
import kodlama.o.hrms.core.utilities.Results.Result;
import kodlama.o.hrms.core.utilities.Results.SuccessDataResult;
import kodlama.o.hrms.core.utilities.Results.SuccessResult;
import kodlama.o.hrms.dataAccess.abstracts.JobAdvertisementConfirmationDao;
import kodlama.o.hrms.entities.concretes.JobAdvertisement;
import kodlama.o.hrms.entities.concretes.JobAdvertisementConfirmation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JobAdvertisementConfirmationManager implements JobAdvertisementConfirmationService {
    private JobAdvertisementConfirmationDao jobAdvertisementConfirmationDao;

    @Autowired
    public JobAdvertisementConfirmationManager(JobAdvertisementConfirmationDao jobAdvertisementConfirmationDao) {
        this.jobAdvertisementConfirmationDao = jobAdvertisementConfirmationDao;
    }

    @Override
    public Result add(JobAdvertisementConfirmation jobAdvertisementConfirmation) {
        jobAdvertisementConfirmationDao.save(jobAdvertisementConfirmation);
        return new SuccessResult("added");
    }

    @Override
    public DataResult<List<JobAdvertisementConfirmation>> getAll() {
        return new SuccessDataResult<List<JobAdvertisementConfirmation>>(jobAdvertisementConfirmationDao.findAll());

    }

    @Override
    public DataResult<List<JobAdvertisementConfirmation>> getByIsConfirmTrue() {
        return new SuccessDataResult<List<JobAdvertisementConfirmation>>(jobAdvertisementConfirmationDao.getByIsConfirmTrue());
    }

    @Override
    public Result toggleConfirmation(int jobAdvertisementConfirmationId) {
        JobAdvertisementConfirmation jobAdvertisementConfirm = this.jobAdvertisementConfirmationDao.findById(jobAdvertisementConfirmationId).get();
        jobAdvertisementConfirm.setConfirm(!jobAdvertisementConfirm.isConfirm());
        this.jobAdvertisementConfirmationDao.save(jobAdvertisementConfirm);
        return new SuccessResult("changed.");

    }
}
