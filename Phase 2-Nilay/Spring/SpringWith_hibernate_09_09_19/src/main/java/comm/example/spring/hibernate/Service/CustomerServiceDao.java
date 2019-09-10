package comm.example.spring.hibernate.Service;

import java.util.List;

import comm.example.spring.hibernate.Entity.Customer;

public interface CustomerServiceDao {
	public void createCustomer(Customer customer);
	public List<Customer> getCustomer();
	
}
