package com.it.ssh.dao;

import com.it.ssh.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserDao {

    @Select("select * from users ")
    public List<User> findAll();

    @Insert("insert into users (user_name,ages) values (#{user_name},#{ages})")
    public void insrtUser(User user);

}
