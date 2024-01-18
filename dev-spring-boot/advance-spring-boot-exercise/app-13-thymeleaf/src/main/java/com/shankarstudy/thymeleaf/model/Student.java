package com.shankarstudy.thymeleaf.model;

public class Student {

    private String sid;
    private String sname;
    private String semail;
    private String smobile;
    private String saddr;

    public Student() {

    }

    public Student(String sid, String sname, String semail, String smobile, String saddr) {
        this.sid = sid;
        this.sname = sname;
        this.semail = semail;
        this.smobile = smobile;
        this.saddr = saddr;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSemail() {
        return semail;
    }

    public void setSemail(String semail) {
        this.semail = semail;
    }

    public String getSmobile() {
        return smobile;
    }

    public void setSmobile(String smobile) {
        this.smobile = smobile;
    }

    public String getSaddr() {
        return saddr;
    }

    public void setSaddr(String saddr) {
        this.saddr = saddr;
    }
}

