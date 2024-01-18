package com.shankarstudy.thymeleaf.controller;

import com.shankarstudy.thymeleaf.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/emp")
public class EmployeeController {

    @RequestMapping(value = "/reg", method = RequestMethod.GET)
    public String showRegForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "empregform";
    }

    @RequestMapping(value = "/reg", method = RequestMethod.POST)
    public String register(@ModelAttribute Employee employee, Model model) {
        model.addAttribute("employee", employee);
        return "empdata";
    }
}
