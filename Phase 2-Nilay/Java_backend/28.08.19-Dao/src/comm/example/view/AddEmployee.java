package comm.example.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.example.dao.EmployeeDao;
import comm.example.dao.EmployeeDaoImpl;
import comm.example.model.Employee;

/**
 * Servlet implementation class AddEmployee
 */
@WebServlet("/add_employee.view")
public class AddEmployee extends HttpServlet {
	EmployeeDaoImpl service=new EmployeeDaoImpl();
	Employee emp= new Employee();
	private static final long serialVersionUID = 1L;
	public String name;
	public String password;
	public String email;
	public String country;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
	
	}
	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		name=request.getParameter("Name");
		password=request.getParameter("Password");
		email=request.getParameter("Email");
		country=request.getParameter("country");
		service.createEmployee(new Employee(name,password,email,country,emp.serialVersionUID++));
		
		
		
		
		
	}

}
