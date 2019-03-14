package com.lgs.logback;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLogbackApplication {

    protected static Logger log = LoggerFactory.getLogger(SpringBootLogbackApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(SpringBootLogbackApplication.class, args);
        log.trace("trace log");
        log.debug("debug log");
        log.info("info log");
        log.warn("warn log");
        log.error("error log");
    }

}
