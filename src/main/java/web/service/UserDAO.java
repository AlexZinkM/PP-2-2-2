package web.service;

import web.model.User;

import java.util.List;

public interface UserDAO {
     List<User> showAll();

    User show(int id);

    void save(User user);

    void update(int id, User updatedPerson);

    public void delete(int id);
}
