package kodlama.o.hrms.dataAccess.abstracts;

import kodlama.o.hrms.entities.concretes.JobAdvertisementConfirmation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobAdvertisementConfirmationDao extends JpaRepository<JobAdvertisementConfirmation,Integer> {
    List<JobAdvertisementConfirmation> getByIsConfirmTrue();
}
