package com.nttdata.bootcamp.micro1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/micro1")
public class TestController {

	
	@GetMapping(path="/helloWorld")
	public String helloWorld() {
		return "Hello Word1";
	}
	
}
