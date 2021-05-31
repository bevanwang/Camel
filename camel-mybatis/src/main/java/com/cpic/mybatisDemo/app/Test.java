package com.cpic.mybatisDemo.app;

import com.cpic.mybatisDemo.dao.UserDao;
import com.cpic.mybatisDemo.domain.User;
import com.cpic.mybatisDemo.services.WelService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
    public static void main(String[] args) {

        ApplicationContext ac =new ClassPathXmlApplicationContext("beans.xml");
        UserDao userDao=(UserDao) ac.getBean("userDao");
        User u1=new User(18, "ruiqiu");
        userDao.insert(u1);

    }
}
