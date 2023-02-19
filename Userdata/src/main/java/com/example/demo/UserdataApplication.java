package com.example.demo;

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
@RequestMapping("/amazon/users")
public class UserdataApplication {
	
	@Autowired
	Userservice service;

	public static void main(String[] args) {
		SpringApplication.run(UserdataApplication.class, args);
	}

	@PostMapping("/saveusers")
	public Userdata savedatatodb(@RequestBody Userdata userdata) {
		Userdata User=service.savedatatodb(userdata);
		return User;
		
	}
	
	@GetMapping("/getusers/{uniqueid}")
		public Userdata get_user_details(@PathVariable String uniqueid) {
			Userdata User=service.get_user_details(uniqueid);
			return User;
		}
}

