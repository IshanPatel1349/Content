package com.example.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {

	Logger log = LoggerFactory.getLogger(LoggingController.class);
	
	@GetMapping("/getlogging")
	public String getLogging()
	{
		log.trace("Ishan Patel is working well");
		return "Hello World";
		
		
		
		
	}
	
	
	
	
	
	
	
}
