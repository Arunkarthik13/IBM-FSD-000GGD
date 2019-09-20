package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Doctor;
import com.example.demo.service.DoctorService;


@RestController
@RequestMapping("/")
public class DoctorController {
	
	private DoctorService doctorService;
	
	@GetMapping("/list")
	public List<Doctor> list() {
		List<Doctor> league = doctorService.getLeagues();
		return league;
	}
	

}
