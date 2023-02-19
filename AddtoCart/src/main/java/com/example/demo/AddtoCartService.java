package com.example.demo;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddtoCartService {
	
	@Autowired
	AddtoCartRepository repo;
	
	@Autowired
	ProductProxy proxy;

	public AddtoCart save_to_cart(AddtoCart addtocart){
		 return repo.save(addtocart);
	}
	
	public AddtoCart delete_from_cart(AddtoCart addtocart) {
		  repo.delete(addtocart);
		  return addtocart;
	}
	
	public CartDetails getallproducts_by_id(UUID userid) {
		CartDetails cartdetails=new CartDetails();
		cartdetails.setUserid(userid);
		
		ArrayList<AddtoCart> cartList= repo.findByuserid(userid);
		ArrayList<Product> productlist=new ArrayList<Product>();
		
		for(int i=0;i<cartList.size();i++) {
			Product product=proxy.find_by_id(cartList.get(i).getProductid());
			productlist.add(product);
		}
		
		cartdetails.setList(productlist);
		return cartdetails;
	}
}
