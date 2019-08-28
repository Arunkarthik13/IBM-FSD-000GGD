package comm.example.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import comm.example.factory.MyConnectionFactory;
import comm.example.model.Employee;


public class EmployeeDaoImpl implements EmployeeDao {
	
	private Connection connection=MyConnectionFactory.getMySqlConnectionForHR();
	private PreparedStatement pStatement=null;
	private Statement statement=null; 
	private ResultSet resultSet=null;
	

	public EmployeeDaoImpl() {
		super();
		
	}

	

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> list=new ArrayList<Employee>();
		try {
			statement=connection.createStatement();
			resultSet=statement.executeQuery("select * from employee1");
			while(resultSet.next())
			{
				list.add(new Employee(resultSet.getString(2), resultSet.getString(3),
						resultSet.getString(4), resultSet.getString(5),resultSet.getInt(6)));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return list;
	}




	@Override
	public void createEmployee(Employee employee) {
	try {
		pStatement=connection.prepareStatement("insert into employee1(name,password,email,country,uid) values(?,?,?,?,?)");
		pStatement.setString(1, employee.getName());
		pStatement.setString(2, employee.getPassword());
		pStatement.setString(3, employee.getEmail());
		pStatement.setString(4, employee.getCountry());
		pStatement.setInt(5,employee.getSerialVersionUID());
		pStatement.executeUpdate();
		
		
	} catch (SQLException e) {
		System.out.println("duplicate id");
		
		e.printStackTrace();
	} 		
	}



	@Override
	public void deleteEmployee(int id){
		try {
			pStatement=connection.prepareStatement("delete from employee1 where uid="+id);
			pStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}



	@Override
	public List<Employee> EditEmployee(int id) {
		List<Employee> list=new ArrayList<Employee>();
		statement=connection.createStatement();
		("select * from employee1 where id="+id);
		
	}
	
	
	
}
