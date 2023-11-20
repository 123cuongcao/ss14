package ra.academy.dao;

import ra.academy.model.User;

import java.util.List;

public interface IGenericDao<T,E> {
    boolean save(T t);
    List<User> findAll();
    void delete (E id);
}
