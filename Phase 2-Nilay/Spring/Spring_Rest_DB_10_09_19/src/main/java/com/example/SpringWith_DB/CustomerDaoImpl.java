package com.example.SpringWith_DB;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.SpringWith_DB.Customer;



@Repository
public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	private SessionFactory sessionFactory;
	private Session session;
	
	@PostConstruct
	public void init() {
		session = sessionFactory.openSession();
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		Query query=session.createQuery("from Customer",Customer.class);
		
		List<Customer> list=query.getResultList();
		return list;
	}

	public void createCustomer(Customer thecustomer) {
		// TODO Auto-generated method stub
		
	}

}