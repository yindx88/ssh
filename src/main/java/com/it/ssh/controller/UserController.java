package com.it.ssh.controller;

import com.it.ssh.domain.User;
import com.it.ssh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("/find")
    public String findAll(Model model)
    {
        List<User> list=userService.findAll();
       model.addAttribute("list",list);

        return "list";

    }
}
