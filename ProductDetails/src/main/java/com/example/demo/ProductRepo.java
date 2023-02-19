package com.example.demo;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<Product, Integer>{
	
	ArrayList<Product> findAll();
	Product findByproductid(UUID productid);

}
