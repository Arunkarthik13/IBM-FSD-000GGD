package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Receipe;
import com.example.demo.repository.ReceipeRepository;

@Service
public class ReceipeServiceImpl implements ReceipeService{

	@Autowired
	private ReceipeRepository receipeRepository;

	@Override
	public List<Receipe> findAll() {
		List<Receipe> list=receipeRepository.findAll();
		
		return list;
	}
    @Override
	public Receipe findById(Long theId) {
		Optional<Receipe> result=receipeRepository.findById(theId);
		Receipe theReceipe=null;
		
		if(result.isPresent())
		{
			theReceipe=result.get();
		}
		else
			throw new RuntimeException("The Id is Invalid"+theId);
		 
		return theReceipe;
	}

	@Override
	public void save(Receipe theReceipe) {
		receipeRepository.save(theReceipe);
		
		
	}
    @Override
	public void deleteById(Long theId) {
		
		receipeRepository.deleteById(theId);
	}

	
	
}
