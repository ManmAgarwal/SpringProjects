package com.example.SpringBootLog;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLogApplication {

	static Logger log = Logger.getLogger("SpringBootLogApplication.class");
	
	public static void main (String[] args) {
		SpringApplication.run(SpringBootLogApplication.class, args);
		
		for (int i=0; i<6000;i++) {
			log.log(Level.INFO,"Logging Info Message");
			log.log(Level.SEVERE,"Logging Severe Message");
			log.log(Level.WARNING,"Logging Warning Message");
		}
	}
}
