package com.homeworktwo.HW2.services;

import com.homeworktwo.HW2.dto.UserDto;
import com.homeworktwo.HW2.models.User;

import java.util.List;

public interface UserService {
    void save(User p);

    void delete(int id);

    UserDto getById(int id);

    List<UserDto> getAll();
}
