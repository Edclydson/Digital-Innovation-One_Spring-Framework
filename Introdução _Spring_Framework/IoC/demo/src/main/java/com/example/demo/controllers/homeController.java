package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
    @RequestMapping("/")
    public String home(){
        return "home";
    }
   
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
