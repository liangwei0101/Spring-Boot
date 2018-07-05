package com.liangwei.Controller;

import com.liangwei.domain.User;
import com.liangwei.userInterface.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/")
    public @ResponseBody
    List<User> searchUser() {
        List<User> result = this.userRepository.findAll();
        return result;
    }

}
