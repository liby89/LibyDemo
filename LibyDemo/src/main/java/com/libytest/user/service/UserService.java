package com.libytest.user.service;

import com.libytest.user.model.User;

/**
 * Created by liby on 2017/3/16.
 */

public interface UserService {
    User selectUserById(Long id);
}