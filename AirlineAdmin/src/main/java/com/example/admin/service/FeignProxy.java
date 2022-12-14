package com.example.admin.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.admin.model.PassengerDto;

@FeignClient(name = "passengerservice")
public interface FeignProxy {
	
	@DeleteMapping("/passenger/delete/{profile_id}")
	public String deletePassenger(@PathVariable("profile_id") int profile_id);
	
	@GetMapping("/passenger/all")
	public List<PassengerDto> getAllPassenger();

}
