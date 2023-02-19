package com.example.demo;

import java.util.ArrayList;
import java.util.UUID;

public class CartDetails {

	private UUID Userid;
	private ArrayList<Product> list;
	public UUID getUserid() {
		return Userid;
	}
	public void setUserid(UUID userid) {
		Userid = userid;
	}
	public ArrayList<Product> getList() {
		return list;
	}
	public void setList(ArrayList<Product> list) {
		this.list = list;
	}
}
