package com.neelav.io.springjenkinsdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinsDemoApplication {

	private static Logger logger = LoggerFactory.getLogger(SpringJenkinsDemoApplication.class);

	@PostConstruct
	public void init()
	{
		logger.info("Init is Called");
	}

	public static void main(String[] args)
	{
		logger.info("Application Executed");
		logger.info("Added another Log just for Testing");
		SpringApplication.run(SpringJenkinsDemoApplication.class, args);
	}

}
