package com.example.demo;

import java.util.UUID;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="product-details", url="localhost:8081")
public interface ProductProxy {

	@GetMapping("/amazon/products/findbyid/{productid}")
	public Product find_by_id(@PathVariable UUID productid);
}
