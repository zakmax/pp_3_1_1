package ru.pp_3_1_1.service;

import org.springframework.stereotype.Service;
import ru.pp_3_1_1.models.User;


import java.util.List;

@Service
public interface UserService {

    List<User> index();
    User show(int id);
    void  save(User user);
    void update(int id, User updatedUser);
    void delete(int id);
}





