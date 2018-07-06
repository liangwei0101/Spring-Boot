package com.liangwei.demo.controller;

import com.liangwei.demo.bean.User;
import com.liangwei.demo.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/")
    public List<User> index(  ) {
        List<User> aa = userRepository.findAll();
        return aa;
    }
}
