package com.wang.controller;

import com.wang.pojo.User;
import com.wang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: ssm_template
 * @description: 用户信息控制器
 * @author: Wang
 * @create: 2018-10-20 19:43
 **/
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("all")
    @ResponseBody
    public List<User> getAllUsers(){
        List<User> users = userService.getAllUsers();
        return users;
    }

}
