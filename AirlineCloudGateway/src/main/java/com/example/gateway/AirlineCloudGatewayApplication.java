package com.example.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AirlineCloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirlineCloudGatewayApplication.class, args);
	}

}
