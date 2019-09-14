package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Soccer;



public interface SoccerService {

	public List<Soccer> findAll();
	
	public Soccer findById(int theId);
	
	public void save(Soccer theSoccer);
	
	public void deleteById(int theId);
	
}