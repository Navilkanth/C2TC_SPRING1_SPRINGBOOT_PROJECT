package com.tnsif.RestApI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/hello")
	public String Welcome(@RequestParam(value="name")String name) 
	{
		return "hello"+name;
	}
}
			