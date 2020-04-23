package com.Thanyani.api;

import com.Thanyani.service.UsersService;
import com.Thanyani.users.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.UUID;

@RestController
public class UsersController {


    @Autowired
    UsersService usersService;

    @GetMapping("/users/{id}")
    public Users findUserById(@PathVariable UUID id)
    {
        System.out.println("Searching by ID  : " + id);

        return usersService.getUser(id);
    }



}
