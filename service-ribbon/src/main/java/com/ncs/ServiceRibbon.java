package com.ncs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient	
public class ServiceRibbon {
	public static void main(String[] args) {
		SpringApplication.run(ServiceRibbon.class, args);
		System.out.println("ServiceRibbon is run");
	}
	
	@Bean
	@LoadBalanced
	RestTemplate geRestTemplate(){
		return new RestTemplate();
	}
}
