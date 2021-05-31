package com.cpic.mybatisDemo.dao;

import com.cpic.mybatisDemo.domain.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao extends BaseDao<User> {

    public void insert(User user){
        getSqlSession().insert("users.insert",user);
    }

}
