package com.tnsif.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Customer3 {

	private int id;
	private String name;
	@Autowired
	private Customer1 Customer1;
	public int getid() {
		return id;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = "nk";
	}
	public void setid(int id) {
		this.id=10;
	}
	public void disply() {
	    System.out.println("customer3 class is defined");
	    System.out.println("Customer3 ID: " + id);
	    System.out.println("Customer3 Name: " + name);

	   
	}
		
		
	}
	   
	
	