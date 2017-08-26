package com.july.springboot.service.impl;

import com.july.springboot.mapper.UserMapper;
import com.july.springboot.model.entity.User;
import com.july.springboot.model.json.UserJson;
import com.july.springboot.service.UserService;
import com.july.springboot.util.PasswordUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Noageir
 * Date: 2017/7/21.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean addUserInfo(User user) {
        //TODO 增加注册接口
        String passWd = user.getPassWord();
        user.setPassWord(PasswordUtil.EncoderByMd5(passWd));
        return false;
    }

    @Override
    public UserJson queryUserInfo(User user) {
        return userMapper.queryUserInfo(user);
    }
}
