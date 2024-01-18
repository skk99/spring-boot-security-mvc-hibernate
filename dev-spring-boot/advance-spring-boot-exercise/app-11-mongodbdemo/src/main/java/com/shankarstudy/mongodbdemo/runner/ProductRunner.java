package com.shankarstudy.mongodbdemo.runner;

import com.shankarstudy.mongodbdemo.beans.Product;
import com.shankarstudy.mongodbdemo.beans.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@Component
public class ProductRunner implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;

    @Transactional
    @Override
    public void run(String... args) throws Exception {
        /*Product product = new Product();
        product.setId(1);
        product.setPid(111);
        product.setPname("Mobile");
        product.setPcost(50000);
        Product prd = productRepository.save(product);
        System.out.println(prd);*/

        List<Product> productList = Arrays.asList(
                new Product(2,222,"Laptop",50000),
                new Product(3, 333, "Book", 500),
                new Product(4, 444, "Pen", 100)
        );
        List<Product> prdList = productRepository.saveAll(productList);
        System.out.println(prdList);

        /*Product product = productRepository.findById(1).get();
        System.out.println(product);*/

        /*List<Product> productList = productRepository.findAll();
        productList.stream().forEach(System.out::println);*/

        /*Product product = productRepository.findProductByPname("Pen");
        System.out.println(product);*/

        /*Product product = productRepository.findProductByPcost(500);
        System.out.println(product);*/

        /*productRepository.deleteById(4);
        System.out.println("Product Deleted Successfully");*/

        /*productRepository.deleteAll();
        System.out.println("Deleted All Documents....");*/

    }
}
