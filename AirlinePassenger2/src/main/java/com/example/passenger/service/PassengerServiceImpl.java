package com.example.passenger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.passenger.model.Passenger;
import com.example.passenger.repo.PassengerRepo;

@Service
public class PassengerServiceImpl implements PassengerService{
	
	@Autowired
	PassengerRepo repo;

	
	@Override
	public List<Passenger> getAllPassenger() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Passenger insertPassenger(Passenger Passenger) {
		// TODO Auto-generated method stub
		return repo.save(Passenger);
	}

	@Override
	public String deletePassenger(int profile_id) {
		// TODO Auto-generated method stub
		repo.deleteById(profile_id);
		return "Profile Deleted";
	}

}
