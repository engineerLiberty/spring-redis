package com.engineerLee.springbootredisserver.service;

import com.engineerLee.springbootredisserver.model.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {
    boolean saveUser(User user);

    List<User> findAllUser();
}
