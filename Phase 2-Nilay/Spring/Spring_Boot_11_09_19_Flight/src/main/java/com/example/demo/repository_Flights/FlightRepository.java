package com.example.demo.repository_Flights;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model_Flights.Flight;

@Repository
public interface FlightRepository extends CrudRepository<Flight, Long> {

}
