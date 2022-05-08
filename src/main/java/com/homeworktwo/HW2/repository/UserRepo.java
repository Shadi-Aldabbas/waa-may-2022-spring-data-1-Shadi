package com.homeworktwo.HW2.repository;

import com.homeworktwo.HW2.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User,Integer> {
}
