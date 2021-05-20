package kodlama.o.hrms.business.abstracts;

import kodlama.o.hrms.entities.concretes.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    void add(User user);
    void delete(User user);
    void update(User user);
    List<User> getAll();


}
