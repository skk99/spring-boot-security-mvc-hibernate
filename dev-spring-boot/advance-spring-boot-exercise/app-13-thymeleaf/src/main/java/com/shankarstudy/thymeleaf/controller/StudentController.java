package com.shankarstudy.thymeleaf.controller;

import com.shankarstudy.thymeleaf.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;

@Controller
public class StudentController {

    @RequestMapping(value = "/reg", method = RequestMethod.GET)
    public String showStudentRegForm(Model model) {
        model.addAttribute("student", new Student());
        return "stdregform";
    }

    @RequestMapping(value = "/reg", method = RequestMethod.POST)
    public String registration(@ModelAttribute Student student, Model model) {
        model.addAttribute("Student", student);
        return "stddetails";
    }

    @RequestMapping("/allstds")
    public String getAllStudents(Model model) {
        model.addAttribute("message", "All Student Details");
        model.addAttribute("students", Arrays.asList(
                new Student("S-111", "Durga",
                        "durga@durgasoft.com","91-9988776655", "Hyderabad"),
                new Student("S-222", "Ramesh",
                        "ramesh@durgasoft.com","91-99887722", "Chennai"),
                new Student("S-333", "Rahul",
                        "rahul@durgasoft.com","91-9988776633", "Pune"),
                new Student("S-444", "Anil",
                        "anil@durgasoft.com","91-9988776611", "Mumbai"),
                new Student("S-555", "Krishna",
                        "krishna@durgasoft.com","91-9988776600", "Delhi")
        ));

        return "allstudents";
    }
}
