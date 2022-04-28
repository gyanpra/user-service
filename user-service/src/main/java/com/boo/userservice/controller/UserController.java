package com.boo.userservice.controller;

import com.boo.userservice.VO.ResponseTemplateVO;
import com.boo.userservice.entity.User;
import com.boo.userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User createUser(@RequestBody User user) {
        log.info("Inside UserController.createUser() with data as ", user);
        return userService.saveUser(user);
    }

    @GetMapping("user/{id}")
    public User getUser(@PathVariable("id") Long id) {
        log.info("Inside UserController.getUser() with Id as ", id);
        return userService.getUserById(id);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId) {
        log.info("Inside UserController.getUserwithDepartment() with department for ", userId);
        return userService.getUserWithDepartment(userId);
    }

}
