package com.shankarstudy.mongodbdemo.beans;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("products")
public class Product {

    @Id
    private int id;
    private int pid;
    private String pname;
    private int pcost;

    public Product() {

    }

    public Product(int id, int pid, String pname, int pcost) {
        this.id = id;
        this.pid = pid;
        this.pname = pname;
        this.pcost = pcost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getPcost() {
        return pcost;
    }

    public void setPcost(int pcost) {
        this.pcost = pcost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", pid=" + pid +
                ", pname='" + pname + '\'' +
                ", pcost=" + pcost +
                '}';
    }
}
