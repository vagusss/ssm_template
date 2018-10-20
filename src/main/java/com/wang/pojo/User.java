package com.wang.pojo;

/**
 * @program: ssm_template
 * @description: 用户实体类
 * @author: Wang
 * @create: 2018-10-20 17:49
 **/
public class User {
    private Long id;            // 编号
    private String userName;    // 用户名
    private String password;    // 密码

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
