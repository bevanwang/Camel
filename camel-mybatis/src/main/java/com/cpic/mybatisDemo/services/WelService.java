package com.cpic.mybatisDemo.services;


import com.cpic.mybatisDemo.domain.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("WelS")
public class WelService {

    private String message;
    @Resource(name = "user")
    private User user;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void sayHello(){
        setMessage("Hello world!");
        System.out.println(message);
        user.testHello();
    }
}
