package com.example.MyThirdSpring.controller;

import com.example.MyThirdSpring.service.MyService;
//import com.example.app.service.MyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

    private static final Logger logger = LoggerFactory.getLogger(MyController.class);

    private final MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/task")
    public String executeTask() {
        logger.info("Received request to execute task.");
        myService.performTask();
        return "Task executed! Check logs for details.";
    }
}