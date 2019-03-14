package com.lgs.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author : lgs
 * @date : 2019/3/13 15:32
 */
@Order(1)
@Component
public class MyCommandLineRunner implements CommandLineRunner {

    /**
     * Callback used to run the bean.
     *
     * @param args incoming main method arguments
     * @throws Exception on error
     */
    @Override
    public void run(String... args) throws Exception {
        System.out.println(">>> MyCommandLineRunner 执行");
    }
}
