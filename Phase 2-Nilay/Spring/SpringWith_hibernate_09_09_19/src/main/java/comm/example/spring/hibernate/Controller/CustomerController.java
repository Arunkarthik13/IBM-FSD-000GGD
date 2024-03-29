package comm.example.spring.hibernate.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import antlr.collections.List;
import comm.example.spring.hibernate.Entity.Customer;
import comm.example.spring.hibernate.Service.CustomerServiceDao;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerServiceDao customerservice;
	
	@GetMapping("/show")
	public String customer_home(Model themodel)
	{
		Customer thecustomer=new Customer();
		themodel.addAttribute("customer",thecustomer);
		return "customer-form";
		
	}
	@PostMapping("/save")
	public String customer_save(@ModelAttribute("customer") Customer thecustomer)
	{
		customerservice.createCustomer(thecustomer);
		return "redirect:list";
	}
	
	@GetMapping("/list")
	public String listcustomers(Model themodel)
	{
		java.util.List<Customer> thecustomers1=customerservice.getCustomer();
		themodel.addAttribute("customer1", thecustomers1);
		return "customer-list";
		
	}
	
	
	
}
