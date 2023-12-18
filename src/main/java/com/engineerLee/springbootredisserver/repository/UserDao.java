package com.engineerLee.springbootredisserver.repository;

import com.engineerLee.springbootredisserver.model.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserDao {
    boolean saveUser(User user);

    List<User> fetchAllUser();
}
