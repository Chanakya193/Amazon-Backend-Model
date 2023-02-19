package com.example.demo;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="Cart")
public class AddtoCart {

	@Id
	public int id;
	
	public UUID userid;
	public UUID productid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public UUID getUserid() {
		return userid;
	}
	public void setUserid(UUID userid) {
		this.userid = userid;
	}
	public UUID getProductid() {
		return productid;
	}
	public void setProductid(UUID productid) {
		this.productid = productid;
	}
	public AddtoCart() {
		super();
	}
	
}
