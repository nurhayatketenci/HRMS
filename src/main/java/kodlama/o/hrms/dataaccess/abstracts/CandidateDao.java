package kodlama.o.hrms.dataAccess.abstracts;

import kodlama.o.hrms.entities.concretes.Candidate;
import kodlama.o.hrms.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CandidateDao extends JpaRepository<Candidate,Integer> {

    Optional<Candidate> findByNationalId(String nationalId);

}
