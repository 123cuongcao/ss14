package ra.academy.service;

import ra.academy.model.User;

import java.util.List;

public interface IGenericService <T,E>{
    boolean save(T t);
    List<User> findAll();
    void delete (E id);
}
