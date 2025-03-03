package com.example.MyThirdSpring.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;;

@Service
public class MyService {

    private static final Logger logger = LoggerFactory.getLogger(MyService.class);

    public void performTask() {
        logger.info("Task started...");
        logger.debug("Task in progress...");
        logger.warn("Warning: Something might be wrong!");
        logger.error("Error occurred!");
    }
}