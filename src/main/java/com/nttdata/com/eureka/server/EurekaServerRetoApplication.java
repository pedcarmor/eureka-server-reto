package com.nttdata.com.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaServerRetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerRetoApplication.class, args);
	}

}
