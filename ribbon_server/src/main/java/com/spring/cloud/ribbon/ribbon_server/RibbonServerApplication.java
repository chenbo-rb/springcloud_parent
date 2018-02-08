package com.spring.cloud.ribbon.ribbon_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@ComponentScan(basePackages={"com.spring.cloud.ribbon.ribbon_server",
		"com.spring.cloud.ribbon.controler",
		"com.spring.cloud.ribbon.server"})
@EnableDiscoveryClient
@SpringBootApplication
@EnableHystrix
@EnableHystrixDashboard
public class RibbonServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonServerApplication.class, args);
	}

	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
