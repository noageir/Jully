package com.july.springboot.mapper;

import com.july.springboot.model.entity.User;
import com.july.springboot.model.json.UserJson;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by Noageir
 * Date: 2017/7/21.
 */
@Mapper
public interface UserMapper {
    UserJson queryUserInfo(User user);

}
