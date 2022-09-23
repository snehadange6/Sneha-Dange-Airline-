package com.example.passenger.service;

import java.util.List;

import com.example.passenger.model.Passenger;

public interface PassengerService {
	
	public List<Passenger> getAllPassenger();
	public Passenger insertPassenger(Passenger Passenger);
	public String deletePassenger(int profile_id);

}
