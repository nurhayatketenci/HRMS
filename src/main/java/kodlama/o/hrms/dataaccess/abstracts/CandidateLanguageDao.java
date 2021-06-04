package kodlama.o.hrms.dataAccess.abstracts;

import kodlama.o.hrms.entities.concretes.CandidateLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CandidateLanguageDao extends JpaRepository<CandidateLanguage,Integer> {
    List<CandidateLanguage> getAllByCandidateId(int candidateId);

}
