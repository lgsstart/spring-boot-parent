package com.lgs.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : lgs
 * @date : 2019/3/13 11:47
 */
@RestController
public class HelloController {

    @GetMapping(value = "/")
    public String hello(){
        return "Hello World";
    }
}
