package com.grapql.example.userAPI.Resource;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.grapql.example.userAPI.Entity.User;
import com.grapql.example.userAPI.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author : Vishal Srivastava
 * @Date : 17-02-2021
 **/

@Component
public class UserQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private UserService userService;

    public List<User> getUsers() {
        return userService.getUsers();
    }

    public User getUser(int userId) {
        return userService.getUserById(userId);
    }
}
