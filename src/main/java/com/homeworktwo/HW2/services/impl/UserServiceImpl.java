package com.homeworktwo.HW2.services.impl;

import com.homeworktwo.HW2.dto.UserDto;
import com.homeworktwo.HW2.models.User;
import com.homeworktwo.HW2.repository.UserRepo;
import com.homeworktwo.HW2.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public void save(User p) {
        userRepo.save(p);
    }

    @Override
    public void delete(int id) {
        userRepo.deleteById(id);
    }

    @Override
    public UserDto getById(int id) {
        UserDto result = new UserDto();
        var item = userRepo.findById(id).get();
        result.setEmail(item.getEmail());
        result.setFName(item.getFName());
        result.setLName(item.getLName());
        result.setId(item.getId());
        result.setPassword(item.getPassword());
        return result;
    }

    @Override
    public List<UserDto> getAll() {
        var result= new ArrayList<UserDto>();
        userRepo.findAll().forEach(item -> {
            UserDto p = new UserDto();
            p.setId(item.getId());
            p.setFName(item.getFName());
            p.setLName(item.getLName());
            p.setEmail(item.getEmail());
            p.setPassword(p.getPassword());
            result.add(p);
        });

        return result;
    }
}
