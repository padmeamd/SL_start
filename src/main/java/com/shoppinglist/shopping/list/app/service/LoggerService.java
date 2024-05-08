package com.shoppinglist.shopping.list.app.service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
public class LoggerService {
    private static final Logger logger = LoggerFactory.getLogger(LoggerService.class);

    public void doSomething() {
        logger.info("This is an info message");
        logger.error("This is an error message");
    }
}
