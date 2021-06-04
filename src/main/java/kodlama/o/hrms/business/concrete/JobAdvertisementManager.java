package kodlama.o.hrms.business.concrete;

import kodlama.o.hrms.business.abstracts.JobAdvertisementService;
import kodlama.o.hrms.core.utilities.Results.DataResult;
import kodlama.o.hrms.core.utilities.Results.Result;
import kodlama.o.hrms.core.utilities.Results.SuccessDataResult;
import kodlama.o.hrms.core.utilities.Results.SuccessResult;
import kodlama.o.hrms.dataAccess.abstracts.JobAdvertisementDao;
import kodlama.o.hrms.entities.concretes.JobAdvertisement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {
   private JobAdvertisementDao jobAdvertisementDao;

   @Autowired
    public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
        this.jobAdvertisementDao = jobAdvertisementDao;
    }

    @Override
    public Result add(JobAdvertisement jobAdvertisement) {
        jobAdvertisementDao.save(jobAdvertisement);
        return new SuccessResult("added");
    }

    @Override
    public DataResult<List<JobAdvertisement>> getAll() {
        return new SuccessDataResult<List<JobAdvertisement>>(jobAdvertisementDao.findAll());

    }

    @Override
    public DataResult<List<JobAdvertisement>> getByEmployerIdAndIsActiveTrue(int employerId) {
        return new SuccessDataResult<>(this.jobAdvertisementDao.getByEmployerIdAndIsActiveTrue(employerId));
    }

    @Override
    public DataResult<List<JobAdvertisement>> getByIsActiveTrue() {
        return new SuccessDataResult<>(this.jobAdvertisementDao.getByIsActiveTrue());

    }

    @Override
    public DataResult<List<JobAdvertisement>> getByApplicationDeadlineLessThanEqual(LocalDate date) {
        return new SuccessDataResult<>(this.jobAdvertisementDao.getByApplicationDeadlineLessThanEqual(date));

    }

    @Override
    public Result jobPostingClosure(int jobAdvertisementId) {
        JobAdvertisement jobClosure = this.jobAdvertisementDao.findById(jobAdvertisementId).get();
        jobClosure.setActive(!jobClosure.isActive());
        this.jobAdvertisementDao.save(jobClosure);
        return new SuccessResult("The announcement has been deactivated.");
    }


}
