package com.lgs.controller;

import com.lgs.aop.AspectLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : lgs
 * @date : 2019/3/14 10:12
 */

@RestController
public class IndexController {
    private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

    @GetMapping(value = "/index")
    public String index(){

        return "index";
    }

}
