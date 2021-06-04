package kodlama.o.hrms.dataAccess.abstracts;
import kodlama.o.hrms.entities.concretes.CandidateJobExperience;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CandidateJobExperienceDao extends JpaRepository<CandidateJobExperience,Integer> {
    List<CandidateJobExperience> getAllByCandidateIdOrderByEndDateDesc(int candidateId);
}

