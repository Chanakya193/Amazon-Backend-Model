package com.example.demo;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name="Products")
public class Product {

	@Id
	@GeneratedValue
	public int id;
	
	public UUID productid;
	public String product_name;
	public double price;
	public double rating;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public UUID getProductid() {
		return productid;
	}
	public void setProductid(UUID productid) {
		this.productid = productid;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
}
