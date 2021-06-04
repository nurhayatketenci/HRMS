package kodlama.o.hrms.dataAccess.abstracts;

import kodlama.o.hrms.entities.concretes.CandidateSchool;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CandidateSchoolDao extends JpaRepository<CandidateSchool,Integer> {
    List<CandidateSchool> getAllByCandidateIdOrderByEndDate(int candidateId);
}
