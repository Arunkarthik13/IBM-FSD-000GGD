package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Receipe;


public interface ReceipeService {

public List<Receipe> findAll();
	
	public Receipe findById(Long theId);
	
	public void save(Receipe theReceipe);
	
	public void deleteById(Long theId);
}
