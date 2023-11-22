package com.project.timely.services;

import com.project.timely.models.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    void create(UserDto user);
}
