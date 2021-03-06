package com.example.SpringWith_DB;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.SpringWith_DB.Customer;

@Service
public class CustomerServiceImpl {
	@Autowired
	private CustomerDao customerDao;
     @Transactional
	public List<Customer> getAllCustomer() {
		List<Customer> list=customerDao.getAllCustomer();
		return list;
	}

}
