package com.sjp.authserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	 
	@RequestMapping("/hello")
	public String m1() {
		return "Hello World";
	}
}
