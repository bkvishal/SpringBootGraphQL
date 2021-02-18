package com.grapql.example.userAPI.Entity;

import lombok.Data;

/**
 * @author : Vishal Srivastava
 * @Date : 15-02-2021
 **/

@Data
public class FullAddress {

    private String city;
    private String country;
    private int zipCode;
    private String street;
}
