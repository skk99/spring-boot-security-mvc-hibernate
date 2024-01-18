package com.shankarstudy.app08.controller;

import com.shankarstudy.app08.bean.Product;
import com.shankarstudy.app08.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    public Product addProduct(Product product){
        Product prd = productService.addProduct(product);
        return prd;
    }
    public Product getProductByPID(int pid){
        Product product = productService.getProductByPID(pid);
        return product;
    }
    public Product getProductByPNAME(String pname){
        Product product = productService.getProductByPNAME(pname);
        return product;
    }
    public Product getProductByPCOST(int pcost){
        Product product = productService.getProductByPCOST(pcost);
        return product;
    }
    public Product update(Product product){
        Product prd = productService.update(product);
        return prd;
    }
    public int updateProduct(Product product){
        int rowCount = productService.updateProduct(product);
        return rowCount;
    }
    public String delete(int pid){
        String status = productService.delete(pid);
        return status;
    }
}
