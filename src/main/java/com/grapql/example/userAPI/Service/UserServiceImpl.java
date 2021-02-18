package com.grapql.example.userAPI.Service;

import com.grapql.example.userAPI.Entity.User;
import com.grapql.example.userAPI.Reprository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : Vishal Srivastava
 * @Date : 15-02-2021
 **/

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepo;

    @Override
    public List<User> getUsers() {
        return userRepo.findAll();
    }

    @Override
    public User getUserById(int userId) {
        return userRepo.getByUserId(userId);
    }

    @Override
    public User addUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public User removeUser(int userId) {
        return userRepo.deleteByUserId(userId);
    }
}
