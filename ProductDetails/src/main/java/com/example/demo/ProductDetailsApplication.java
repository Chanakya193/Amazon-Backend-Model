package com.example.demo;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/amazon/products")
public class ProductDetailsApplication {
	
	@Autowired
	ProductService service;

	public static void main(String[] args) {
		SpringApplication.run(ProductDetailsApplication.class, args);
	}
	
	@PostMapping("/saveProduct")
	public Product save_product_to_db(@RequestBody Product product) {
		Product Products=service.save_Product_Details_to_db(product);
		return Products;
	}
	
	@GetMapping("/getallproducts")
	public ArrayList<Product> get_all_products(){
		ArrayList<Product> Products=service.find_all_products();
		return Products;
	}
	
	@GetMapping("/findbyid/{productid}")
	public Product find_by_id(@PathVariable UUID productid) {
		Product Products= service.get_by_productid(productid);
		return Products;
	}

}
