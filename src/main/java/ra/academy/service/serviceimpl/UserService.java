package ra.academy.service.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ra.academy.dao.IUserDao;
import ra.academy.dao.daoimpl.UserDao;
import ra.academy.dto.UserDto;
import ra.academy.model.User;
import ra.academy.service.IUserService;

import java.util.List;
@Service
public class UserService implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public boolean save(User user) {

        return userDao.save(user);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public void delete(Integer id) {
        userDao.delete(id);
    }
}
