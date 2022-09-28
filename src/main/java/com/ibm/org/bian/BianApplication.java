package com.ibm.org.bian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages ="com.ibm.org.bian.*")
public class BianApplication {

	public static void main(String[] args) {
		SpringApplication.run(BianApplication.class, args);
	}

}
