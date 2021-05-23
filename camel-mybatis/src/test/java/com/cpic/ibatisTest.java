package com.cpic;

import com.cpic.mybatisDemo.domain.Order;
import com.cpic.mybatisDemo.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class ibatisTest {

    @Test
    public void selectOne(){

        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession s= sf.openSession();
            Order order=s.selectOne("orders.selectOne","No002");
            System.out.println(order.getUser().getName());
            s.commit();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
