package com.it.ssh.service.impl;

import com.it.ssh.dao.UserDao;
import com.it.ssh.domain.User;
import com.it.ssh.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

public class UserServiceImplTest {

    @Before
    public void setUp() throws Exception {
    }

    ApplicationContext applicationContext=new ClassPathXmlApplicationContext("springConfig.xml");
    UserService userService= (UserService) applicationContext.getBean("userServiceImpl");

    @Autowired
    public UserDao userDao;
    @Test
    public void findAll() {

        User user=new User();
        user.setUser_name("hua");
        user.setAges(12);
        userService.insertUser(user);

        if(userService==null)
        {
            System.out.println("sdsgfd");
        }else {
         List<User> list= userService.findAll();
         for(User users:list)
             System.out.println(users);
        }
    }
}