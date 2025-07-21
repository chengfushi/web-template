package com.chengfu.springbootinit.service;

import com.chengfu.springbootinit.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import jakarta.servlet.http.HttpServletRequest;

/**
* @author Lenovo
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2025-07-20 21:00:51
*/
public interface UserService extends IService<User> {

    User getLoginUser(HttpServletRequest request);
}
