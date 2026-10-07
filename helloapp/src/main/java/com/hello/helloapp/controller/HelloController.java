package com.hello.helloapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class HelloController {
	

	@GetMapping("/hello")
	String hello()
	{
		return "Hi from spring boot application";
	}

}
