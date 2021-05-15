package kodlama.o.hrms.dataaccess.abstracts;

import kodlama.o.hrms.entities.concretes.JobPosition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobPositionDao extends JpaRepository<JobPosition,Integer> {
}
