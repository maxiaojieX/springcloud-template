package com.webvideo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MtvEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MtvEurekaApplication.class, args);
	}

}

