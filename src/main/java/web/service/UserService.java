package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAll();

    User get(long id);

    void create(User user);

    void update(User updatedPerson);

    public void delete(long id);
}
