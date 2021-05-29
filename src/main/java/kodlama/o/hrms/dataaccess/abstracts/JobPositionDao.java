package kodlama.o.hrms.dataAccess.abstracts;

import kodlama.o.hrms.entities.concretes.JobPosition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface JobPositionDao extends JpaRepository<JobPosition,Integer> {
    Optional<JobPosition> findByjobTitleContainsIgnoreCase (String jobTitle);
}