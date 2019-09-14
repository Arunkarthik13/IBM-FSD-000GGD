package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Soccer;
import com.example.demo.repository.SoccerRepository;




@Service
public class SoccerServiceImpl implements SoccerService {

	private SoccerRepository soccerRepository;
	
	@Autowired
	public SoccerServiceImpl(SoccerRepository theSoccerRepository) {
		soccerRepository = theSoccerRepository;
	}
	
	@Override
	public List<Soccer> findAll() {
		return soccerRepository.findAllByOrderByTitleAsc();
	}

	@Override
	public Soccer findById(int theId) {
		Optional<Soccer> result = soccerRepository.findById(theId);
		
		Soccer theSoccer = null;
		
		if (result.isPresent()) {
			theSoccer = result.get();
		}
		else {
			// we didn't find the Soccer
			throw new RuntimeException("Did not find Soccer id - " + theId);
		}
		
		return theSoccer;
	}

	@Override
	public void save(Soccer theSoccer) {
		soccerRepository.save(theSoccer);
	}

	@Override
	public void deleteById(int theId) {
		soccerRepository.deleteById(theId);
	}

}



