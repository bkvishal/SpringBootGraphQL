package com.grapql.example.userAPI.Resource;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.grapql.example.userAPI.Entity.User;
import com.grapql.example.userAPI.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author : Vishal Srivastava
 * @Date : 17-02-2021
 **/

@Component
public class UserMutationResolver implements GraphQLMutationResolver {

    @Autowired
    private UserService userService;


    public User addUser(User user) {
        return userService.addUser(user);
    }

    public User deleteUser(int userId) {
        return userService.removeUser(userId);
    }
}
