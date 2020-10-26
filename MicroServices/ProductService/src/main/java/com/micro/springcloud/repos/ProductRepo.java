package com.micro.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micro.springcloud.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
