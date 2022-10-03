package com.springboot.controller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;

@RestController
public class MessageController {
	
	Logger logger = (Logger) LoggerFactory.getLogger(MessageController.class);
	
	@GetMapping("/messages")
	public String getMessage() {
		logger.info("[get message] infomessage");
		logger.warn("[get message] warn message");
		logger.error("[get message] error omessage");
		logger.debug("[get message] debug message");
		logger.trace("[get message] trace message");
		return "open the console";
	}

}
