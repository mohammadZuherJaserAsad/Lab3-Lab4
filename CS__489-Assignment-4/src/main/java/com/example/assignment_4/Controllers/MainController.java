package com.example.assignment_4.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {


    @GetMapping(value = {"/"})
    private String getHomePage(){
        return "home/index.html";
    }
}
