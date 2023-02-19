package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Userservice {
	
	@Autowired
	UserRepo repo;
	
	public Userdata savedatatodb(Userdata userdata) {
		return repo.save(userdata);
	}
	
	public Userdata get_user_details(String uniqueid) {
		return repo.findById(uniqueid);
	}

}
