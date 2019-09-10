package comm.example.spring.hibernate.Dao;

import java.util.List;

import comm.example.spring.hibernate.Entity.Customer;

public interface CustomerDao {

	public void createCustomer(Customer customer);
	public List<Customer> getCustomer();
}
