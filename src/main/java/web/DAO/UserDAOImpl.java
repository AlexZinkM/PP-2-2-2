package web.DAO;


import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {


    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<User> getAll() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }


    @Override
    @Transactional
    public void update(User user) {
        entityManager.merge(user);
    }

    @Override
    @Transactional
    public User get(long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    @Transactional
    public void delete(long id) {
        entityManager.remove(get(id));
    }

    @Override
    @Transactional
    public void create(User user) {
        entityManager.persist(user);
    }






}
