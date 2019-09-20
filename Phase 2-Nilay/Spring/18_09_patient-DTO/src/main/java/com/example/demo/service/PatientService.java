package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.example.demo.entity.Patient;
import com.example.demo.repo.PatientRepository;

@Service
public class PatientService {
	
	private PatientRepository patientRepository;

	public PatientService(PatientRepository patientRepository) {
		super();
		this.patientRepository = patientRepository;
	}
	
	public List<Patient> getLeagues() {
		List<Patient> doctor = new ArrayList<Patient>();
		for (Patient l : patientRepository.findAllBySpeciality()) {
			doctor.add(l);
		}
		return doctor;
	}


}
