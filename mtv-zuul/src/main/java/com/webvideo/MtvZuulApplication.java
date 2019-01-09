package com.webvideo;

import com.webvideo.config.ZuulFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class MtvZuulApplication {

	@Bean
	public ZuulFilter myZuulFilter() {
		return new ZuulFilter();
	}

	public static void main(String[] args) {
		SpringApplication.run(MtvZuulApplication.class, args);
	}

}

