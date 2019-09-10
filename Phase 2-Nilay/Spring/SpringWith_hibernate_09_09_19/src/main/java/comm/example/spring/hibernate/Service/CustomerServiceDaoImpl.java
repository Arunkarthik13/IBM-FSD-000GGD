package comm.example.spring.hibernate.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import comm.example.spring.hibernate.Dao.CustomerDao;
import comm.example.spring.hibernate.Entity.Customer;

@Service
public class CustomerServiceDaoImpl implements CustomerServiceDao{

	@Autowired
	CustomerDao customerdao;
	@Transactional
	public void createCustomer(Customer customer) {
		customerdao.createCustomer(customer);
		
	}
    @Transactional
	public List<Customer> getCustomer() {
		List<Customer> list=customerdao.getCustomer();
	
		return list;
	}

}
