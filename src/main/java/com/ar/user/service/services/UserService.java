package com.ar.user.service.services;

import com.ar.user.service.entities.User;

import java.util.List;

public interface UserService {
    // user operations

    // create user
    User saveUser(User user);

    // getAll users
    List<User> getAllUser();

    // getUser using userId
    User getUser(String userId);

    /* TODO: Update, delete */

}
