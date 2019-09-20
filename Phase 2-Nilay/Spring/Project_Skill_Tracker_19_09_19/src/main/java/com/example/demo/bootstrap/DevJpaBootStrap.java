package com.example.demo.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.example.demo.Entity.Employee;

import com.example.demo.repository.EmployeeRepository;


@Controller
public class DevJpaBootStrap implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private EmployeeRepository employeeRepository;
	

	public DevJpaBootStrap(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository=employeeRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		init();
	}

	private void init() {
		Employee emp=new Employee("Arun", "9843277119", "arunksv1998@gmail.com","Java");

		employeeRepository.save(emp);
		


	}

}