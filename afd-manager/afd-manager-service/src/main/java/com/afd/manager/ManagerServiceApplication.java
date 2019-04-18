package com.afd.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:config/dubbo-provider.xml")
@SpringBootApplication
public class ManagerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagerServiceApplication.class, args);
	}

}
