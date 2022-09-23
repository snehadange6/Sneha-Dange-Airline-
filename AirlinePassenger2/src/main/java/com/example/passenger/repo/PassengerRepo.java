package com.example.passenger.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.passenger.model.Passenger;

@Repository
public interface PassengerRepo extends JpaRepository<Passenger, Integer> {

}
