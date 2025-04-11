package com.example.usercenterback.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 高桥凉介
 * 用户注册请求参数类
 */
@Data
public class UserRegisterRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    private String userAccount;
    private String password;
    private String checkPassword;

}
