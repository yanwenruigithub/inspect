package com.ruifeng.inspect.controller;

import com.ruifeng.inspect.entity.User;
import com.ruifeng.inspect.service.imp.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService mUserService;

    @RequestMapping("/register")
    public void register(@RequestParam String name, @RequestParam Long phone) {
        User user = new User();
        user.setName(name);
        user.setPhone(phone);
        mUserService.create(user);
    }
}
