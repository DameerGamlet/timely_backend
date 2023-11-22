package com.project.timely.services;

import com.project.timely.models.UserDto;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    public void create(UserDto user) {
        System.out.println(user);
    }
}
