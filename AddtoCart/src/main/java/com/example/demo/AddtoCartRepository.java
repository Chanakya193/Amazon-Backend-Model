package com.example.demo;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

public interface AddtoCartRepository extends CrudRepository<AddtoCart, Integer>{

	ArrayList<AddtoCart> findByuserid(UUID userid);
}
