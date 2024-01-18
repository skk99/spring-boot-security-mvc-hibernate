package com.shankarstudy.app08.runner;

import com.shankarstudy.app08.bean.Product;
import com.shankarstudy.app08.controller.ProductController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ProductRunner implements ApplicationRunner {

    @Autowired
    private ProductController productController;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        /*
        Product product = new Product();
        product.setPname("Mobile");
        product.setPcost(25000);
        Product prd = productController.addProduct(product);
        System.out.println(prd);
        */
        /*
        Product product = productController.getProductByPID(1);
        System.out.println(product);
         */
        /*
        Product product = productController.getProductByPNAME("Mobile");
        System.out.println(product);
         */
        /*
        Product product = productController.getProductByPCOST(25005);
        System.out.println(product);
         */
        /*
        Product product = new Product();
        product.setPid(2);
        product.setPname("Laptop");
        product.setPcost(50000);
        Product prd = productController.update(product);
        System.out.println(prd);
         */
        /*
        Product product = new Product();
        product.setPid(3);
        product.setPname("Laptop");
        product.setPcost(500000);
        int rowCount = productController.updateProduct(product);
        System.out.println(rowCount);
         */

        String status = productController.delete(1);
        System.out.println(status);
    }
}
