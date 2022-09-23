package com.example.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(value = "com.example.admin.service")
@EnableEurekaClient
public class AirlineAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirlineAdminApplication.class, args);
	}

}
