package com.devopsbuddy.devopsbuddy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class helloworldcontroller {

    @RequestMapping("/")
    public String sayhello()
    {
        return "index";
    }

}
