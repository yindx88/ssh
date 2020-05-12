package com.it.ssh.service.impl;

import com.it.ssh.dao.UserDao;
import com.it.ssh.domain.User;
import com.it.ssh.service.UserService;
import org.springframework.aop.target.LazyInitTargetSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
   public UserDao userDao;

    @Override
    public List<User> findAll() {

       List<User> list= userDao.findAll();
      return  list;
    }

    @Override
    public void insertUser(User user) {

        userDao.insrtUser(user);
    }


}
