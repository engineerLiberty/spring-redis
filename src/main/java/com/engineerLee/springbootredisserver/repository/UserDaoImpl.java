package com.engineerLee.springbootredisserver.repository;

import com.engineerLee.springbootredisserver.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserDaoImpl implements UserDao{
    private final RedisTemplate redisTemplate;
    private static final String KEY = "USER";
    @Override
    public boolean saveUser(User user) {
        try {
            redisTemplate.opsForHash().put(KEY,user.getId(),user);
         return true;
        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public List<User> fetchAllUser() {
        return (List<User>) redisTemplate.opsForHash().values(KEY);
    }
}
