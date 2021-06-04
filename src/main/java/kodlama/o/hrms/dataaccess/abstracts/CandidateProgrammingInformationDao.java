package kodlama.o.hrms.dataAccess.abstracts;
import kodlama.o.hrms.entities.concretes.CandidateProgrammingInformation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CandidateProgrammingInformationDao extends JpaRepository<CandidateProgrammingInformation,Integer> {
    List<CandidateProgrammingInformation> getAllByCandidateId(int candidateId);
}
