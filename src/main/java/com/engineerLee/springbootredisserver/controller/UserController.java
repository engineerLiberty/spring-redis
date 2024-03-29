package com.engineerLee.springbootredisserver.controller;

import com.engineerLee.springbootredisserver.model.User;
import com.engineerLee.springbootredisserver.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("user")
    public ResponseEntity<String> saveUser(User user) {
          boolean result = userService.saveUser(user);
          if (result)
              return ResponseEntity.ok("User Created Successfully");
                else
                    return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
          
    }


    @GetMapping("user")
    public ResponseEntity<List<User>> fetchAll() {
        return ResponseEntity.ok(userService.findAllUser());
    }
}
