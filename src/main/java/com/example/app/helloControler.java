package com.example.app;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloControler {
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
}
