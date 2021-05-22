package com.cpic.mybatisDemo;

import com.cpic.mybatisDemo.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class app {

    public static void main(String[] args) {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession s= sf.openSession();
            System.out.println(s);
            User u1=new User(23, "linda");
            s.insert("users.insert",u1);
            s.commit();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
