package com.example.demo.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")

	public String sayHi(){
		return "Hi welcome to keshavs world";
		
		//System.out.println("im writing this method");



	}
}

//venkatesh
//sandeep
// sandeep test
//mounika