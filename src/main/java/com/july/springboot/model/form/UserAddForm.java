package com.july.springboot.model.form;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserAddForm {
    @ApiModelProperty("用户名")
    @NotNull(message = "用户名不能为空")
    @Size(min = 2, max = 10, message = "用户名不能为空")
    private String userName;

    @ApiModelProperty("密码")
    @NotNull(message = "密码不能为空")
    @Size(min = 6, max = 18, message = "密码不能为空")
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
