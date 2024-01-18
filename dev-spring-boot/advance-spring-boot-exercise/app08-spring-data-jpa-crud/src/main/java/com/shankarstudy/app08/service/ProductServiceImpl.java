package com.shankarstudy.app08.service;

import com.shankarstudy.app08.bean.Product;
import com.shankarstudy.app08.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        Product prd = productRepository.save(product);
        return prd;
    }

    @Override
    public Product getProductByPID(int pid) {
        Product product = productRepository.findById(pid).get();
        return product;
    }

    @Override
    public Product getProductByPNAME(String pname) {
        Product product = productRepository.findProductByPname(pname);
        return product;
    }

    @Override
    public Product getProductByPCOST(int pcost) {
        Product product = productRepository.findProductByPcost(pcost);
        return product;
    }

    @Override
    public Product update(Product product) {
        Product prd = productRepository.findById(product.getPid()).get();
        prd.setPname(product.getPname());
        prd.setPcost(product.getPcost());
        return prd;
    }

    @Override
    public int updateProduct(Product product) {
        int rowCount = productRepository.updateProduct(product.getPid(), product.getPname(), product.getPcost());
        return rowCount;
    }

    @Override
    public String delete(int pid) {
        productRepository.deleteById(pid);
        return "SUCCESS";
    }
}
