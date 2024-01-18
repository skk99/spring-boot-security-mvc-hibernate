package com.shankarstudy.app08.service;

import com.shankarstudy.app08.bean.Product;

public interface ProductService {

    public Product addProduct(Product product);
    public Product getProductByPID(int pid);
    public Product getProductByPNAME(String pname);
    public Product getProductByPCOST(int pcost);
    public Product update(Product product);
    public int updateProduct(Product product);
    public String delete(int pid);
}
