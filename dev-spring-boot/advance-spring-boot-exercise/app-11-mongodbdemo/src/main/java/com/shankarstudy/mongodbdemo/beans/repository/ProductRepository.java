package com.shankarstudy.mongodbdemo.beans.repository;

import com.shankarstudy.mongodbdemo.beans.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, Integer> {
    public Product findProductByPname(String pname);
    public Product findProductByPcost(int pcost);
}
