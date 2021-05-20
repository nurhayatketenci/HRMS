package kodlama.o.hrms.business.concrete;

import kodlama.o.hrms.business.abstracts.UserService;
import kodlama.o.hrms.dataaccess.abstracts.UserDao;
import kodlama.o.hrms.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager implements UserService {

    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add(User user) {

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public List<User> getAll() {
        return userDao.findAll();
    }
}
