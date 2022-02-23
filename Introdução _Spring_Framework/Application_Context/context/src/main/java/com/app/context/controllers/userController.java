package com.app.context.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.app.context.services.userService;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class userController {

    @Autowired
    private userService service;

    @RequestMapping("/")
    public String home(){
        service.buscaNome();
        service.deletaDados();
        return "home";
    }
    
}
