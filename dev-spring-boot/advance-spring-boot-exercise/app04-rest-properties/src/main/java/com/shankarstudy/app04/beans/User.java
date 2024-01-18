package com.shankarstudy.app04.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class User {
    @Value("${user.uname}")
    private String name;
    @Value("${user.uaddress}")
    private String address;
    @Value("${user.uquals}")
    private String[] quals;
    @Value("${user.utechs}")
    private List<String> techs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String[] getQuals() {
        return quals;
    }

    public void setQuals(String[] quals) {
        this.quals = quals;
    }

    public List<String> getTechs() {
        return techs;
    }

    public void setTechs(List<String> techs) {
        this.techs = techs;
    }
}
