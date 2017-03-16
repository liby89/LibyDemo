package com.libytest.user.service.impl;

import com.libytest.user.dao.UserDao;
import com.libytest.user.model.User;
import com.libytest.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liby on 2017/3/16.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public User selectUserById(Long id) {
        return userDao.selectUserById(id);
    }
}