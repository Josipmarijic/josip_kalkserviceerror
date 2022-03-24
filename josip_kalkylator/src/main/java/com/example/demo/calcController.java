package com.example.demo;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calcController implements ErrorController {
	
	private calcService kalkylator = new calcService();
	
	@CrossOrigin
	@RequestMapping("/")
	public String root() {
		return kalkylator.kalkylatorDescription();
	}
	
	@CrossOrigin
	@RequestMapping("/kalkylator")
	public String kalkylator(String n1, String n2, String operator) {
		
		return kalkylator.kalkylator(n1, n2, operator);
	}
	
	private static final String PATH = "/error";

	@RequestMapping(value = PATH, produces = MediaType.TEXT_HTML_VALUE)
	public String error() {
		return root() ;
	}
	
    public String getErrorPath() {
		
		return PATH;
	}

}