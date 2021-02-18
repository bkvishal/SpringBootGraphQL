package com.grapql.example.userAPI.Reprository;

import com.grapql.example.userAPI.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : Vishal Srivastava
 * @Date : 15-02-2021
 **/

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User getByUserId(int userId);
    User deleteByUserId(int userId);
}
