package com.jiyuanwai.logging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class LoggingApplication {
//	java.util.logging.Logger jul = java.util.logging.Logger.getLogger(LoggingApplication.class.getName());
//	org.apache.log4j.Logger log4j1 = org.apache.log4j.Logger.getLogger(LoggingApplication.class);
//	org.apache.logging.log4j.Logger log4j2 = org.apache.logging.log4j.LogManager.getLogger(LoggingApplication.class);
//	org.apache.commons.logging.Log jcl = org.apache.commons.logging.LogFactory.getLog(LoggingApplication.class);
//	org.jboss.logging.Logger jbossLogging = org.jboss.logging.Logger.getLogger(LoggingApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LoggingApplication.class, args);
	}

}
