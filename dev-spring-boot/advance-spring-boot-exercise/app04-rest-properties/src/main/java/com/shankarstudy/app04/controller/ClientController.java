package com.shankarstudy.app04.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@PropertySource("file:config/client.properties")
@RestController
public class ClientController {
    @Autowired
    private Environment environment;

    @RequestMapping("/client")
    public String getStdDetails(){
        String data = "<h1>Client[";
        data = data + environment.getProperty("client.clientNo")+",";
        data = data + environment.getProperty("client.clientName")+",";
        data = data + environment.getProperty("client.clientAddress")+"]</h1>";
        return data;
    }
}
