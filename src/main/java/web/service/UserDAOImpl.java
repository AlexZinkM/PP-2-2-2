package web.service;


import org.springframework.stereotype.Component;
import web.model.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDAOImpl implements UserDAO {

    private static long USER_COUNT;
    private List<User> users;

    {
        users = new ArrayList<>();

        users.add(new User(++USER_COUNT, "Иван", "Иванов", (byte) 30));
        users.add(new User(++USER_COUNT, "Мария", "Петрова", (byte) 25));
        users.add(new User(++USER_COUNT, "Алексей", "Сидоров", (byte) 35));
        users.add(new User(++USER_COUNT, "Екатерина", "Смирнова", (byte) 28));
        users.add(new User(++USER_COUNT, "Дмитрий", "Козлов", (byte) 40));
    }

    public List<User> showAll() {
        return users;
    }

    public User show(int id) {
        return users.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

    public void save(User user) {
        user.setId(++USER_COUNT);
        users.add(user);
    }

    public void update(int id, User updatedPerson) {
        User personToBeUpdated = show(id);

        personToBeUpdated.setName(updatedPerson.getName());
    }

    public void delete(int id) {
        users.removeIf(p -> p.getId() == id);
    }

    public static void main(String[] args) {
        UserDAOImpl ud = new UserDAOImpl();
        System.out.println(ud.showAll());
    }
}
