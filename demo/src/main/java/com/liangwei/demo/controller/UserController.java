package com.liangwei.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class UserController {
    public String index(  ) {
        return "Hello Spring Boot!";
    }
}
