package com.it.ssh.dao;

import com.it.ssh.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

public class UserDaoTest {

    @Test
    public void findAll() throws IOException {
        InputStream inputStream= Resources.getResourceAsStream("mybatisConfig.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        UserDao userDao=sqlSession.getMapper(UserDao.class);
        List<User> list=userDao.findAll();
        for(User user : list)
            System.out.println(user);
        sqlSession.close();
        inputStream.close();


    }
}