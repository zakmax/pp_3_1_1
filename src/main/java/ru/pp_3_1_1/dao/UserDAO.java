package ru.pp_3_1_1.dao;



import ru.pp_3_1_1.models.User;

import java.util.List;


public interface UserDAO {
    List<User> index();
    User show(int id);
    void save(User user);
    void update(int id, User updatedUser);
    void delete(int id);
}