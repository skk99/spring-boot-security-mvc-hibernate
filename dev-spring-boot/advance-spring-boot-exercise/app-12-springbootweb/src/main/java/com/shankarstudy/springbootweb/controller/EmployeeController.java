package com.shankarstudy.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("emp")
public class EmployeeController {

    @RequestMapping("homepage")
    public String showHomePage(Model model){
        model.addAttribute("message", "Welcome To Spring Boot WEB MVC Application");
        return "home";
    }

}
