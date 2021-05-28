package kodlama.o.hrms.dataAccess.abstracts;

import kodlama.o.hrms.entities.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerDao extends JpaRepository<Employer,Integer> {
}
