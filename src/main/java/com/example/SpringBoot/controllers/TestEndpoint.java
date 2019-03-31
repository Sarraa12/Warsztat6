package com.example.SpringBoot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestEndpoint {

//    @GetMapping("/test")
//    public String test(){
//        return "Hello world";
//    }
    @GetMapping("/test2")
    public String welcome(Model model){
        return "welcome";
    }

}
