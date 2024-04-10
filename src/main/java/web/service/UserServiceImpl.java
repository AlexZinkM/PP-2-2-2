package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.UserDAO;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    final private UserDAO ud;

    @Autowired
    public UserServiceImpl(UserDAO ud) {
        this.ud = ud;
    }


    public List<User> getAll() {
        return ud.getAll();
    }

    public User get(long id) {
        return ud.get(id);
    }

    public void create(User user) {
        ud.create(user);
    }

    public void update(User user) {
        ud.update(user);
    }
    public void delete(long id) {
         ud.delete(id);
    }
}
