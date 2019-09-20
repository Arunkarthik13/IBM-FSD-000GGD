package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Doctor;
import com.example.demo.repo.DoctorRepository;

@Service
public class DoctorService {
	
	@Autowired
	private DoctorRepository doctoryRepository;

	
	public DoctorService() {
		super();
	}

	public DoctorService(DoctorRepository doctoryRepository) {
		super();
		this.doctoryRepository = doctoryRepository;
	}
	
	public List<Doctor> getLeagues() {
		List<Doctor> doctor = new ArrayList<Doctor>();
		for (Doctor l : doctoryRepository.findAll()) {
			doctor.add(l);
		}
		return doctor;
	}

}
