package com.example.demo.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")

	public String sayHi(){
		System.out.println("im writing this method");
		return "Hi";


	}
}

//venkatesh
//sandeep
// sandeep test