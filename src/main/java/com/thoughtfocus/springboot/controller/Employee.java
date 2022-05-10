package com.thoughtfocus.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Employee {
    @GetMapping("/")
    public String name(){
        return "index";
    }
    @GetMapping("/addEmployee")
    public String addEmployee(){
        return "add_employee";
    }

}
