package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name="User")
public class Userdata {
	@Id
	@GeneratedValue
	public int id;
	
	public int uniqueid;
	public String name;
	public String email;

	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getUniqueid() {
		return uniqueid;
	}



	public void setUniqueid(int uniqueid) {
		this.uniqueid = uniqueid;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Userdata() {
		super();
	}
	
}
