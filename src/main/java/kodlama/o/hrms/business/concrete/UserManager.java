package kodlama.o.hrms.business.concrete;

import kodlama.o.hrms.business.abstracts.UserService;
import kodlama.o.hrms.dataAccess.abstracts.UserDao;
import kodlama.o.hrms.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManager implements UserService {
    private UserDao userDao;
 @Autowired
    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User get(int id) {
        return null;
    }

    @Override
    public String add(User user) {
        return null;
    }

    @Override
    public User getByMail(String email) {
        return null;
    }
}
