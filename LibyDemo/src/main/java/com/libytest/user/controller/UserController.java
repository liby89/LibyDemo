package com.libytest.user.controller;

import com.libytest.user.model.User;
import com.libytest.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by liby on 2017/3/15.
 */

    @Controller
    @RequestMapping("/user")
    public class UserController{

    @Autowired
    private UserService userService;

    @RequestMapping("getUserNameById")
        public String getUserNameById(HttpServletRequest request, Model model)
        {
            String id=request.getParameter("id");
            User user=userService.selectUserById(Long.parseLong(id));
            model.addAttribute("userName",user.getName());
            return "user";

        }
    }




