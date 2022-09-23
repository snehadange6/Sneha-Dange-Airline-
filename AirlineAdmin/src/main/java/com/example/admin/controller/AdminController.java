package com.example.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.admin.model.Admin;
import com.example.admin.model.PassengerDto;
import com.example.admin.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	AdminService service;
	
	@GetMapping("/all")
	public List<Admin> getFlightDetails() {
		return service.findAllFlight();
	}
	
	@PostMapping("/add")
	public Admin addFlight(@RequestBody Admin admin) {
		return service.addFlight(admin);
	}
	
	@DeleteMapping("/delete/{flight_id}")
	public String deleteFlight(@PathVariable("flight_id")int flight_id) {
		return service.deleteFlight(flight_id);
	}
	
	@PutMapping("/update")
	public Admin updateFlight(@RequestBody Admin admin) {
		return service.addFlight(admin);
	}
	@GetMapping("/passenger/all")
	public List<PassengerDto> getPassengerDetails() {
		return service.getAllPassenger();
	}
	
	@DeleteMapping("passenger/delete/{profile_id}")
	public String deletePassenger(@PathVariable("profile_id")int profile_id) {
		return service.deletePassenger(profile_id);
	}

}
