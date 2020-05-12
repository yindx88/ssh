package com.it.ssh.service;

import com.it.ssh.domain.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();
    public void insertUser(User user);
}
