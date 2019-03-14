package com.lgs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRunnerApplication {

	public static void main(String[] args) {
		System.out.println(">>> 开始启动");
		SpringApplication.run(SpringBootRunnerApplication.class, args);
		System.out.println(">>> 启动完成");
	}

}
