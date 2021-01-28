package com.shopping.woo.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.shopping.woo.main.service.MainService;

@Controller
public class MainController {
    
    @Autowired
    private MainService mainService;
    
    @RequestMapping("/")
    public String main() {
        System.out.println("test!!");
        System.out.println(mainService.getTest());
        
        return "main";
    }
}
