package com.cpic.mybatisDemo.domain;

import org.springframework.stereotype.Repository;

@Repository
public class User {
    private Integer id;
    private int age;
    private String name;

    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public User(){}

    public void testHello(){
        System.out.println("Resource 注入！！！");
    }

}
