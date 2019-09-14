package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Incredient;
import com.example.demo.repository.IncredientRepository;

@Service
public class IncredientServiceImpl implements IncredientService{

	@Autowired
	private IncredientRepository incredientRepository;

	@Override
	public List<Incredient> findAll() {
		
		
		return incredientRepository.findAll();
	}
    @Override
	public Incredient findById(Long theId) {
		Optional<Incredient> result=incredientRepository.findById(theId);
		Incredient theIncredient=null;
		
		if(result.isPresent())
		{
			theIncredient=result.get();
		}
		else
			throw new RuntimeException("The Id is Invalid"+theId);
		 
		return theIncredient;
	}

	@Override
	public void save(Incredient theIncredient) {
		incredientRepository.save(theIncredient);
		
		
	}
	@Override
	public void deleteById(Long theId) {
		
		incredientRepository.deleteById(theId);
	}

	
	
	
}
