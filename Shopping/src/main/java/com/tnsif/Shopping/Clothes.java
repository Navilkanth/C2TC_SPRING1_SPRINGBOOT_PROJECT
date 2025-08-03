package com.tnsif.Shopping;
import org.springframework.stereotype.Component;
@Component
public class Clothes implements Ordering{
	public void order() {
		System.out.println("ordering clothes");
	}
}
