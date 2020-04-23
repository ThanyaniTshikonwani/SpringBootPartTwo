package com.Thanyani.service;

import com.Thanyani.users.Users;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UsersService {
    @Cacheable("Users")
    public Users getUser(UUID id){
        try
        {
            System.out.println("Going to sleep for 4 Secs.. to simulate backend call.");
            Thread.sleep(1000*4);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        return new Users(id,"Thanyani" ,"Tshikonwani");
    }
}
