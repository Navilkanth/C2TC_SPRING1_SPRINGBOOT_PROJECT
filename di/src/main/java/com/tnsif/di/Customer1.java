package com.tnsif.di;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component

public class Customer1 {
	
	private int id;
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name; 
	
	
	public int getid() {
		return id;
		
	}
	public void setid(int id) {
		this.id=id;
	}
	

}
