package com.jp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLoggingApplication {
	
	private static Logger logger = LoggerFactory.getLogger(SpringBootLoggingApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLoggingApplication.class, args);
		logger.trace("from TRACE");
		logger.debug("from DEBUG");
		logger.info("from INFO");
		logger.warn("from WARN");
		logger.error("from ERROR");
		Integer a = null;
		try {
			a.byteValue();	
		}catch (Exception e) {
			logger.error(e.getMessage());
		}
		
		
			
	}

}
