package com.mygit.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @Value("${username}")
    private String username ;

    @RequestMapping("/say")
    @ResponseBody
    public String say(){
        return "say  "+username;
    }
}
