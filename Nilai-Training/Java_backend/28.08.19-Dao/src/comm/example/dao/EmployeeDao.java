package comm.example.dao;

import java.sql.SQLException;
import java.util.List;

import comm.example.model.Employee;

public interface EmployeeDao {
	
	public void createEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public void deleteEmployee(int id) throws Exception;
	public List<Employee> EditEmployee();
}