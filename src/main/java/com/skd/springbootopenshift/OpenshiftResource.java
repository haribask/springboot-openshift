package com.skd.springbootopenshift;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OpenshiftResource {

	@GetMapping("/test")
	public String test() {
		System.out.prinln("testing for events");
		return "Welcome to Spring boot openshift";
		
	}
}
