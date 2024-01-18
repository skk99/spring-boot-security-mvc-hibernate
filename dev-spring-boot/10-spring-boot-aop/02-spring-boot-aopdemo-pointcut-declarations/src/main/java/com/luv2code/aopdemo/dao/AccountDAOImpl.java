package com.luv2code.aopdemo.dao;

import com.luv2code.aopdemo.Account;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO{

    private String name;

    private String service;

    @Override
    public void addAccount(Account theAccount, boolean vipFlag) {
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
    }

    @Override
    public boolean doWork() {
        System.out.println(getClass() + "In doWork");
        return false;
    }

    public String getName() {
        System.out.println(getClass() + "In getName");
        return name;
    }

    public void setName(String name) {
        System.out.println(getClass() + "In setName");
        this.name = name;
    }

    public String getService() {
        System.out.println(getClass() + "In getService");
        return service;
    }

    public void setService(String service) {
        System.out.println(getClass() + "In setService");
        this.service = service;
    }
}
