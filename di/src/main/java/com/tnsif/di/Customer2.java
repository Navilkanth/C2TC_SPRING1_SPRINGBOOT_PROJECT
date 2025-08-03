package com.tnsif.di;

import org.springframework.stereotype.Component;
@Component
public class Customer2 {
	private int id;
	private String name; 
	public int getid() {
		return id;
		
	}
	public void setid(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
