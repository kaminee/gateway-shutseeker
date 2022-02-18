package com.kim.balk.gatewayshutseeker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class GatewayShutseekerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayShutseekerApplication.class, args);
	}
	
	@RequestMapping
	public String shuttingGateway(){
		return "Thanks for visiting shutting page";
	}

}
