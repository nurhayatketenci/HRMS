package kodlama.o.hrms.dataAccess.abstracts;


import kodlama.o.hrms.business.abstracts.JobAdvertisementService;
import kodlama.o.hrms.entities.concretes.JobAdvertisement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement,Integer> {
    List<JobAdvertisement> getByEmployerIdAndIsActiveTrue(int employerId);
    List<JobAdvertisement> getByIsActiveTrue();
    List<JobAdvertisement> getByApplicationDeadlineLessThanEqual(LocalDate date);
    //tarih ve tarihten öncekileri getir




}
