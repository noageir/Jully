package com.july.springboot.model.form;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Noageir
 * Date: 2017/7/21.
 */
public class UserQueryForm {
    @ApiModelProperty(value = "用户名")
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "{" +
                "userName='" + userName + '\'' +
                '}';
    }
}
