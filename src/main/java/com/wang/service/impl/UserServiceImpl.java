package com.wang.service.impl;

import com.wang.mapper.UserMapper;
import com.wang.pojo.User;
import com.wang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: ssm_template
 * @description: 用户表相关的service接口实现类
 * @author: Wang
 * @create: 2018-10-20 19:38
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    /** 
    * @Description: 获取表中所有的用户信息
    * @Param: [] 
    * @return: java.util.List<com.wang.pojo.User> 
    * @Author: Wang 
    * @Date: 18/10/20 
    */
    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }
}
