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




    public List<User> index() {

        return userDao.index();
    }

    public User show(int id) {

        return userDao.show(id);


    }

    @Transactional
    public  void save(User user) {
    userDao.save(user);
    }

    @Transactional
    public void update(int id, User updatedUser) {
        User userToBeUpdated = show(id);

        userToBeUpdated.setName(updatedUser.getName());

    }

    @Transactional
    public void delete(int id) {

        userDao.delete(id);
    }
}

