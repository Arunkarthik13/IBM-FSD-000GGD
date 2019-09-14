package com.example.demo.repository_Flights;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model_Flights.Reservation;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {

}
