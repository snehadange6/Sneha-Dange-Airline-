package com.example.passenger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.passenger.model.Passenger;
import com.example.passenger.service.PassengerService;

@RestController
@RequestMapping("/passenger")
public class PassengerController {
	
	@Autowired
	PassengerService service;
	
	@GetMapping("/all")
	public List<Passenger> getPassenger() {
		return service.getAllPassenger();
	} 
	
	@PostMapping("/add")
	public Passenger addPassenger(@RequestBody Passenger passenger) {
		return service.insertPassenger(passenger);
	}
	
	@DeleteMapping("/delete/{profile_id}")
	public String deleteProfile(@PathVariable("profile_id") int profile_id) {
		return service.deletePassenger(profile_id);
	}

}
