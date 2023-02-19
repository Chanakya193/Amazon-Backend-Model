package com.example.demo;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/amazon/cart")
@EnableFeignClients
public class AddtoCartApplication {
	
	@Autowired
	AddtoCartService service;

	public static void main(String[] args) {
		SpringApplication.run(AddtoCartApplication.class, args);
	}

	@PostMapping("/save")
	public AddtoCart savetocart(@RequestBody AddtoCart addtocart) {
		AddtoCart Cart=service.save_to_cart(addtocart);
		return Cart;
	}
	
	@DeleteMapping("/remove")
	public AddtoCart removefromcart(@RequestBody AddtoCart addtocart) {
		AddtoCart Cart=service.delete_from_cart(addtocart);
		return Cart;
	}
	
	@GetMapping("/getbyid/{userid}")
	public CartDetails getproductsbyid(@PathVariable UUID userid) {
		CartDetails cartdetails=service.getallproducts_by_id(userid);
		return cartdetails;
	}
}
