package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Incredient;

public interface IncredientService {

public List<Incredient> findAll();
	
	public Incredient findById(Long theId);
	
	public void save(Incredient theIncredient);
	
	public void deleteById(Long theId);
}
