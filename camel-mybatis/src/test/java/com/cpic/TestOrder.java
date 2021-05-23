package com.cpic;

import com.cpic.mybatisDemo.domain.Order;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class TestOrder {

    @Test
    public void selectOne(){

        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession s= sf.openSession();
            Order order=s.selectOne("orders.selectOne", 2);
            System.out.println(order.getOrderNo());
            s.commit();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
