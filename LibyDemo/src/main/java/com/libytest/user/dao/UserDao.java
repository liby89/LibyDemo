package com.libytest.user.dao;

import com.libytest.user.model.User;

/**
 * Created by liby on 2017/3/15.
 */
public interface UserDao {

    User selectUserById(Long id);
}
