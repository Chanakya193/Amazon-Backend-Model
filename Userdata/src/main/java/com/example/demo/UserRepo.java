package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<Userdata, Integer> {

	Userdata findById(String uniqueid);

}
