package kodlama.o.hrms.business.abstracts;

import kodlama.o.hrms.entities.concretes.JobPosition;

import java.util.List;

public interface JobPositionService {
    List <JobPosition> getAll();
}
