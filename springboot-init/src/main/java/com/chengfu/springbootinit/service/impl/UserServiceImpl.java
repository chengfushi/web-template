package com.chengfu.springbootinit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chengfu.springbootinit.model.entity.User;
import com.chengfu.springbootinit.service.UserService;
import com.chengfu.springbootinit.mapper.UserMapper;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;

/**
* @author Lenovo
* @description 针对表【user(用户)】的数据库操作Service实现
* @createDate 2025-07-20 21:00:51
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

    // TODO
    @Override
    public User getLoginUser(HttpServletRequest request) {
        return null;
    }
}




