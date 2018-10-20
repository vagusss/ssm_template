package com.wang.mapper;

import com.wang.pojo.User;

import java.util.List;

/**
 * @program: ssm_template
 * @description: 用户表实体mapper接口类
 * @author: Wang
 * @create: 2018-10-20 19:21
 **/
public interface UserMapper {
    /** 
    * @Description: 获取表中所有的用户信息
    * @Param: [] 
    * @return: java.util.List<com.wang.pojo.User> 
    * @Author: Wang 
    * @Date: 18/10/20 
    */
    List<User> getAllUsers();
}
