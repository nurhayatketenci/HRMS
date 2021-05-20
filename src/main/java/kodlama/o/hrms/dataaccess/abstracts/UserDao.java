package kodlama.o.hrms.dataaccess.abstracts;

import kodlama.o.hrms.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User ,Integer> {
}
