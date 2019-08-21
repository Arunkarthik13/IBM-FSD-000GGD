package comm.example.service;

import java.sql.SQLException;
import java.util.List;

import comm.example.model.Employee;

public interface EmployeeService {
	public void createEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public Employee getEmployeeById(int id);
	public void getMetadata();
	public void Deletedata(int id) throws SQLException;

}