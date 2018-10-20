package com.wang.service;

import com.wang.pojo.User;

import java.util.List;

/**
 * @program: ssm_template
 * @description: 用户表相关的service接口
 * @author: Wang
 * @create: 2018-10-20 19:36
 **/
public interface UserService {
    /**
    * @Description: 获取表中所有的用户信息
    * @Param: []
    * @return: java.util.List<com.wang.pojo.User>
    * @Author: Wang
    * @Date: 18/10/20
    */
    List<User> getAllUsers();
}
