package com.example.demo.repository_Flights;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model_Flights.Passenger;

@Repository
public interface PassengerRepository extends CrudRepository<Passenger, Long> {

}
