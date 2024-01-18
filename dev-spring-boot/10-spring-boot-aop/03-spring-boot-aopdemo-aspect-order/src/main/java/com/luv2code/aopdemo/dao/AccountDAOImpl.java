package com.luv2code.aopdemo.dao;

import com.luv2code.aopdemo.Account;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AccountDAOImpl implements AccountDAO{

    private String name;

    private String service;

    @Override
    public List<Account> findAccounts() {
        return findAccounts(false);
    }

    @Override
    public List<Account> findAccounts(boolean tripWire) {

        // for academic purpose .. simulate an exception

        if (tripWire) {
            throw new RuntimeException("No Soup for you !!!");
        }

        List<Account> myAccounts = new ArrayList<>();

        // create sample accounts
        Account temp1 = new Account("John", "Silver");
        Account temp2 = new Account("Madhu", "Platinum");
        Account temp3 = new Account("Luca", "Gold");

        // add them to accounts list
        myAccounts.add(temp1);
        myAccounts.add(temp2);
        myAccounts.add(temp3);
        System.out.println("Returning from AccountDAOImpl");
        return myAccounts;
    }

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
