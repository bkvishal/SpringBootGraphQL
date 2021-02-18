package com.grapql.example.userAPI.Service;

import com.grapql.example.userAPI.Entity.User;

import java.util.List;

/**
 * @author : Vishal Srivastava
 * @Date : 15-02-2021
 **/

public interface UserService {

    List<User> getUsers();
    User getUserById(int userId);
    User addUser (User user);
    User removeUser(int userId);

}
