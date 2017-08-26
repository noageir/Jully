package com.july.springboot.service;

import com.july.springboot.model.entity.User;
import com.july.springboot.model.json.UserJson;

/**
 * Created by Noageir
 * Date: 2017/7/21.
 */
public interface UserService {
    boolean addUserInfo(User user);

    UserJson queryUserInfo(User user);
}
