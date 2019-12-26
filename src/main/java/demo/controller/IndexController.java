package com.demo.spring.boot.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
    @RequestMapping("/")
    String index(){
        return "Merry Christmas!!";
    }
}
