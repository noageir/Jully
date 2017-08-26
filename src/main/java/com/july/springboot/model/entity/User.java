package com.july.springboot.model.entity;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Noageir
 * Date: 2017/7/21.
 */
public class User extends Entity {
    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("密码")
    private String passWord;

    @ApiModelProperty("年龄")
    private Integer age;

    @ApiModelProperty("城市编码")
    private Integer cityCode;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getCityCode() {
        return cityCode;
    }

    public void setCityCode(Integer cityCode) {
        this.cityCode = cityCode;
    }
}
