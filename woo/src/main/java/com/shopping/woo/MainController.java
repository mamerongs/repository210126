package com.shopping.woo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
    
    @RequestMapping("/")
    public String main() {
        return "main";
    }
}
