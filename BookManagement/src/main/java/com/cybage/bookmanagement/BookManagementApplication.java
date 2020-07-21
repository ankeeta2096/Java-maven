package com.cybage.bookmanagement;
//feature1

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

@SpringBootApplication
public class BookManagementApplication extends SpringBootServletInitializer implements ApplicationRunner  {

static final Logger logger = LogManager.getLogger(BookManagementApplication.class); 

	public static void main(String[] args) {
		SpringApplication.run(BookManagementApplication.class, args);
	}
	@Override
   
 public void run(ApplicationArguments applicationArguments) throws Exception {
		
		
		
//
		logger.debug("Log4j appender configuration is successful !!"); 	
		// change root level to debug to work
//    
    logger.info("Info log");
//     
   logger.warn("Hey, This is a warning!");
//   
     logger.error("Oops! We have an Error. OK");
//  
      logger.fatal("Damn! Fatal error. Please fix me.");
  
  }

}


