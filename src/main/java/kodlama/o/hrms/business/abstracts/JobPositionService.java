package kodlama.o.hrms.business.abstracts;

import kodlama.o.hrms.entities.concretes.JobPosition;


import java.util.List;

public interface JobPositionService {
    void add(JobPosition jobPosition);
    void delete(JobPosition jobPosition);
    void update(JobPosition jobPosition);
    List <JobPosition> getAll();
}
