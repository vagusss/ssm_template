package com.wang.exception;

/**
 * @program: ssm_template
 * @description: 自定义异常类
 * @author: Wang
 * @create: 2018-10-20 19:52
 **/
public class CustomException extends Exception {
    private String message;

    public CustomException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
