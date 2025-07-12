package ru.pp_3_1_1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.pp_3_1_1.dao.UserDAO;
import ru.pp_3_1_1.models.User;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    public UserDAO userDao;

    @Autowired
    public UserServiceImpl(UserDAO userDao) {
        this.userDao = userDao;
    }

    @Transactional
    @Override
    public List<User> index() {
        return userDao.index();
    }
    @Transactional
    @Override
    public User show(int id) {
        return userDao.show(id);
    }
    @Transactional
    @Override
    public  void save(User user) {
        userDao.save(user);
    }

    @Transactional
    @Override
    public void update(int id, User updatedUser) {
        User userToBeUpdated = show(id);
        userToBeUpdated.setName(updatedUser.getName());

    }

    @Transactional
    @Override
    public void delete(int id) {
        userDao.delete(id);
    }
}
