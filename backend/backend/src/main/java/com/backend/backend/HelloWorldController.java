package com.backend.backend;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class HelloWorldController {
	@GetMapping(path = "/hello")
	public String helloWorld() {
		return "hello";
	}

	@GetMapping(path = "/helloBean")
	public HelloBean helloBean() {
//		throw new RuntimeException("Some Error Occurred!");
		return new HelloBean("hi");
	}

	@GetMapping(path = "/helloBean/{name}")
	public HelloBean helloBean(@PathVariable String name) {
		return new HelloBean(String.format("hi, %s", name));
	}
}
