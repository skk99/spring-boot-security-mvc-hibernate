package com.shankarstudy.app01.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "empployee")
public class Employee {
    //@Value("${employee.eno}")
    private int eno;
    //@Value("${employee.ename}")
    private String ename;
    //@Value("${employee.esal}")
    private float esal;
    //@Value("${employee.eaddr}")
    private String eaddr;

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public float getEsal() {
        return esal;
    }

    public void setEsal(float esal) {
        this.esal = esal;
    }

    public String getEaddr() {
        return eaddr;
    }

    public void setEaddr(String eaddr) {
        this.eaddr = eaddr;
    }
}
