package com.example.admin.service;

import java.util.List;

import com.example.admin.model.Admin;
import com.example.admin.model.PassengerDto;

public interface AdminService {
	
	public List<Admin> findAllFlight();
	
	public Admin addFlight(Admin admin);
	
	public String deleteFlight(int flight_id);
	
	public List<PassengerDto> getAllPassenger();
	public String deletePassenger(int profile_id);

}
