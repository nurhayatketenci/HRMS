package kodlama.o.hrms.business.concrete;

import kodlama.o.hrms.business.abstracts.JobPositionService;
import kodlama.o.hrms.core.utilities.Business.BusinessRules;
import kodlama.o.hrms.core.utilities.results.*;
import kodlama.o.hrms.dataAccess.abstracts.JobPositionDao;
import kodlama.o.hrms.entities.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPositionManager implements JobPositionService {
    private JobPositionDao jobPositionDao;

    @Autowired //newlemek için daoya karşılık veren sınıf varsa yerleştir.
    public JobPositionManager(JobPositionDao jobPositionDao) {

        this.jobPositionDao = jobPositionDao;
    }

    @Override
    public Result add(JobPosition jobPosition) {
        Result result= BusinessRules.run(checkJobTitle(jobPosition.getJobTitle()));
        if (!result.isSuccess()){
            return result;
        }
        jobPositionDao.save(jobPosition);
        return new SuccessResult("position added");
    }

    @Override
    public Result delete(JobPosition jobPosition) {

        return new SuccessResult("deleted");
    }

    @Override
    public Result update(JobPosition jobPosition) {
        return new SuccessResult("updated");    }

    @Override
    public DataResult<List<JobPosition>> getAll() {
        return new SuccessDataResult<List<JobPosition>> (this.jobPositionDao.findAll());
    }
    private Result checkJobTitle(String jobTitle){
        if (jobPositionDao.findByjobTitleContainsIgnoreCase(jobTitle).isPresent()){//isPresent true ise veritabanında kayıt mevcuttur null değildir.
            return new ErrorResult("this position already exists");
        }
        return new SuccessResult("verified");
    }
}
