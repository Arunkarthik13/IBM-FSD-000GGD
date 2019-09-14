package com.example.demo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Soccer;


@Repository
public interface SoccerRepository extends JpaRepository<Soccer, Integer> {

	// that's it ... no need to write any code LOL!
	
	// add a method to sort by last name
	public List<Soccer> findAllByOrderByTitleAsc();
	
}

