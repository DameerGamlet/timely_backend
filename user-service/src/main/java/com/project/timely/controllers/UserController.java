package com.project.timely.controllers;

import com.project.timely.models.UserDto;
import com.project.timely.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/public/api/v1/")
public class UserController {

    private final UserService userService;

    @PostMapping("user")
    public void createUser(UserDto user) {
        userService.create(user);
    }
}
