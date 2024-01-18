package com.shankarstudy.app05.controller;

import com.shankarstudy.app05.beans.ProfilesEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfilesController {
    @Autowired
    private ProfilesEnvironment profilesEnvironment;
    @RequestMapping("/profile")
    public String getProfilesDetails() {
        String data = "Application Name : " + profilesEnvironment.getApplicationName() + "<br>";
        data = data + "Driver Class Name : " + profilesEnvironment.getDriverClassName() + "<br>";
        data = data + "Driver URL : " + profilesEnvironment.getUrl() + "<br>";
        data = data + "Database User Name : " + profilesEnvironment.getUserName() + "<br>";
        data = data + "Database password : "+profilesEnvironment.getPassword();
        return data;
    }

    }
