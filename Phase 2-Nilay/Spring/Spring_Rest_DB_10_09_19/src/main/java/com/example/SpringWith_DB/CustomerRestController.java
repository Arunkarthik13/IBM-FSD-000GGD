package com.example.SpringWith_DB;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringWith_DB.Customer;
import java.util.List;



@RestController
@RequestMapping("/api")
public class CustomerRestController {

	@Autowired
	private CustomerService service;
	
    @GetMapping("/cus")
	public List<Customer> getAllCustomers()
	{
		List<Customer> list=service.getAllCustomer();
		return list;
	}
}
