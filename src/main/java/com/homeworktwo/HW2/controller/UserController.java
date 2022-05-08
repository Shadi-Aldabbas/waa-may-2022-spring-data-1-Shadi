package com.homeworktwo.HW2.controller;

import com.homeworktwo.HW2.dto.UserDto;
import com.homeworktwo.HW2.models.User;
import com.homeworktwo.HW2.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public void save(@RequestBody User user) {
        userService.save(user);
    }
    @DeleteMapping
    public void deleteById(@RequestParam int id) {
        userService.delete(id);
    }
    @GetMapping
    public List<UserDto> getAll() {
        return userService.getAll();
    }
    @GetMapping("/{id}")
    public UserDto getById(@RequestParam int id) {
        return userService.getById(id);
    }
}
