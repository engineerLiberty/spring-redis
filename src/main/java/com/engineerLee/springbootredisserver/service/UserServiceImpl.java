package com.engineerLee.springbootredisserver.service;

import com.engineerLee.springbootredisserver.model.User;
import com.engineerLee.springbootredisserver.repository.UserDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserDao userDao;
    @Override
    public boolean saveUser(User user) {
        return userDao.saveUser(user);
    }

    @Override
    public List<User> findAllUser() {
        return userDao.fetchAllUser();
    }
}
