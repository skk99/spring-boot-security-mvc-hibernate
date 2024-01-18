package com.shankarstudy.app08.repository;

import com.shankarstudy.app08.bean.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface ProductRepository extends JpaRepository<Product,Integer> {

    // If we want to find product my column other than Primary key col, below implementation are extra apart
    // from crud support
    public Product findProductByPname(String pname);
    public Product findProductByPcost(int pcost);

    @Modifying
    @Transactional
    @Query("update Product as p set p.pname=:pname, p.pcost = :pcost where p.pid=:pid")
    public int updateProduct(int pid, String pname, int pcost);

}
