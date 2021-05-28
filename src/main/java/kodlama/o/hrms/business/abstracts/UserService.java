package kodlama.o.hrms.business.abstracts;

import kodlama.o.hrms.entities.concretes.User;

public interface UserService {
    User get(int id);
    String add(User user);
    User getByMail(String email);
}
