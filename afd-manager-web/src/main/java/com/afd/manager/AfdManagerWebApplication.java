package com.afd.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:config/dubbo-consumer.xml")
@SpringBootApplication
public class AfdManagerWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(AfdManagerWebApplication.class, args);
	}

}
