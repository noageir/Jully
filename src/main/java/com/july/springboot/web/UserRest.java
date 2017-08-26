package com.july.springboot.web;

import com.july.springboot.model.entity.User;
import com.july.springboot.model.form.UserAddForm;
import com.july.springboot.model.form.UserQueryForm;
import com.july.springboot.model.json.UserJson;
import com.july.springboot.service.UserService;
import com.july.springboot.util.PasswordUtil;
import com.july.springboot.util.back.ReturnJson;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Noageir
 * Date: 2017/7/21.
 */
@RestController
@RequestMapping("/user")
@Api(description = "用户管理")
public class UserRest {
    private static final Logger logger = LoggerFactory.getLogger(UserRest.class);

    @Autowired
    private UserService userService;

    @PostMapping("/add_user_info")
    @ApiOperation(value = "注册用户", notes = "通过提交用户名注册用户，返回成功失败结果", response = Boolean.class)
    public ReturnJson addUserInfo(@RequestBody() UserAddForm userAddForm) {
        User user = new User();
        BeanUtils.copyProperties(userAddForm, user);
        return ReturnJson.success(userService.addUserInfo(user));
    }

    @PostMapping("/query_user_info")
    @ApiOperation(value = "查询用户信息", notes = "通过用户名查询用户信息，返回结果集", response = UserJson.class)
    public ReturnJson queryUserInfo(@RequestBody() UserQueryForm userQueryForm) {
        User user = new User();
        BeanUtils.copyProperties(userQueryForm, user);
        return ReturnJson.success(userService.queryUserInfo(user));
    }

}
