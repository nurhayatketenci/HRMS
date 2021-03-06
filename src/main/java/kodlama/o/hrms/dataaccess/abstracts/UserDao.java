package kodlama.o.hrms.dataAccess.abstracts;

import kodlama.o.hrms.entities.concretes.Candidate;
import kodlama.o.hrms.entities.concretes.JobPosition;
import kodlama.o.hrms.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {

}
