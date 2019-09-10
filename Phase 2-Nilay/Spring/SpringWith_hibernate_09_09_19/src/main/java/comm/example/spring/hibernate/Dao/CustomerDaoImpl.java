package comm.example.spring.hibernate.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import comm.example.spring.hibernate.Entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao{
     
	@Autowired
	private SessionFactory sessionfactory;
	public void createCustomer(Customer customer) {
		Session currentSession=sessionfactory.getCurrentSession();
		currentSession.save(customer);
		
	}

	public List<Customer> getCustomer() {
		Session currentSession=sessionfactory.getCurrentSession();
		
		Query<Customer> query=currentSession.createQuery("from Customer order by lastname",Customer.class);
		
		List<Customer> customer_list=query.getResultList();
		System.out.println(customer_list);
		
		return customer_list;
	}

}
