package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.UserDAO;
import web.DAO.UserDAOImpl;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDAO ud = new UserDAOImpl();
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
    public User delete(long id) {
        return ud.delete(id);
    }
}
