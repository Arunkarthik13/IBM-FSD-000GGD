package com.example.demo.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Soccer;
import com.example.demo.service.SoccerService;


@Controller
@RequestMapping("/soccers")
public class SoccerController {

	private SoccerService soccerService;
	
	public SoccerController(SoccerService theSoccerService) {
		this.soccerService = theSoccerService;
	}
	
	// add mapping for "/list"

	@GetMapping("/list")
	public String listEmployees(Model theModel) {
		
		// get employees from db
		List<Soccer> theSoccer = soccerService.findAll();
		
		// add to the spring model
		theModel.addAttribute("soccers", theSoccer);
		
		return "soccers/list-soccers";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
         Soccer theSoccer = new Soccer();
		
		theModel.addAttribute("soccer", theSoccer);
		
		return "soccers/soccer-form";
	}

	@PostMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("soccerId") int theId,
									Model theModel) {
		
		// get the employee from the service
		Soccer theSoccer  = soccerService.findById(theId);
		
		// set employee as a model attribute to pre-populate the form
		theModel.addAttribute("employee", theSoccer);
		
		// send over to our form
		return "employees/employee-form";			
	}
	
	
	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("employee") Soccer theSoccer) {
		
		// save the employee
		soccerService.save(theSoccer);
		
		// use a redirect to prevent duplicate submissions
		return "redirect:/soccers/list";
	}
	
	
	@PostMapping("/delete")
	public String delete(@RequestParam("employeeId") int theId) {
		
		// delete the employee
		soccerService.deleteById(theId);
		
		// redirect to /employees/list
		return "redirect:/soccers/list";
		
	}
}
 