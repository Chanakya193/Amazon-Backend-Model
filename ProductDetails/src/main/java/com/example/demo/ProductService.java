package com.example.demo;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	ProductRepo repo;
	
	public Product save_Product_Details_to_db(Product product){
		product.setProductid(UUID.randomUUID()); 
		return repo.save(product);
	}

	public ArrayList<Product> find_all_products(){
		return repo.findAll();
	}
	
	public Product get_by_productid(UUID productid) {
		return repo.findByproductid(productid);
	}
}
