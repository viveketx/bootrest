package com.cdac.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WelcomeController {
	int count;
	@GetMapping("/message")
	public String getMessage() {
		try{ }
		catch(Exception e){}
		return "welcome...";
	}
}
