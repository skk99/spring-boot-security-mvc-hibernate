package com.shankarstudy.app03.controller;

import com.shankarstudy.app03.beans.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@PropertySource("file:customer.properties")
@RestController
public class CustomerController {
//    @Autowired
//    private Environment environment;
    private Customer customer;

    @Autowired
    public CustomerController(Customer theCustomer) {
        this.customer = theCustomer;
    }

    @RequestMapping("/cust")
    public String getCustDetails(){
        String data = "<h1>Customer[";
//        data = data + environment.getProperty("customer.custId")+",";
//        data = data + environment.getProperty("customer.custName")+",";
//        data = data + environment.getProperty("customer.custAddress")+"]</h1>";
        data = data + customer.getCid()+",";
        data = data + customer.getCname()+",";
        data = data + customer.getCemail()+",";
        data = data + customer.getCaddr()+"]</h1>";

        return data;
    }
}
