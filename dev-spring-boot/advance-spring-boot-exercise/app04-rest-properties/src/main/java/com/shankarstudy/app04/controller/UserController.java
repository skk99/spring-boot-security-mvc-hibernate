package com.shankarstudy.app04.controller;

import com.shankarstudy.app04.beans.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Value("${message}")
    private String message;

    @Autowired
    private User user;

    @RequestMapping("/user")
    public String getUserDetails(){
        String data = "<h1>User[";
        data = data + "Name : "+ user.getName()+",";
        data = data + "Address : "+user.getAddress()+",";
        data = data + "Qualifications:";
        for(String qual: user.getQuals()){
            data = data + qual+" ";
        }
        data = data+",Technologies: "+user.getTechs();
        data = data +"]</h1>";
        data = data + "<h2>" + message + "</h2>";
        return data;
    }
}
