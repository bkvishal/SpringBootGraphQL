package com.grapql.example.userAPI.Entity;

import lombok.Data;

import javax.persistence.*;


/**
 * @author : Vishal Srivastava
 * @Date : 15-02-2021
 **/

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    private String username;
    private String number;
    private String email;
    private String password;

    // private FullAddress address;
}
