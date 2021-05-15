package kodlama.o.hrms.business.concrete;

import kodlama.o.hrms.business.abstracts.JobPositionService;
import kodlama.o.hrms.dataaccess.abstracts.JobPositionDao;
import kodlama.o.hrms.entities.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPositionManager implements JobPositionService {
    private JobPositionDao jobPositionDao;

    @Autowired //newlemek için
    public JobPositionManager(JobPositionDao jobPositionDao) {
        this.jobPositionDao = jobPositionDao;
    }

    @Override
    public List<JobPosition> getAll() {
        return jobPositionDao.findAll();
    }
}
