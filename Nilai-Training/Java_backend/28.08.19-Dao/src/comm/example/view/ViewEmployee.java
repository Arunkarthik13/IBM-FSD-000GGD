package comm.example.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.example.dao.EmployeeDao;
import comm.example.dao.EmployeeDaoImpl;
import comm.example.model.Employee;

@WebServlet("/view_employee.view")
public class ViewEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
   EmployeeDao service=new EmployeeDaoImpl();
   List<Employee> list=new ArrayList<Employee>();
    public ViewEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
	}

	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		list=service.getAllEmployees();
		out.println("<table border=\"1\"><tr><th>Name</th><th>Password</th><th>Email</th><th>Country</th><th>Unique Id</th></tr>");
		for(Employee e:list)
		{
			out.println("<tr><td>"+e.getName()+"</td><td>"+e.getPassword()+"</td><td>"+e.getEmail()+
			"</td><td>"+e.getCountry()+"</td><td>"+e.getSerialVersionUID()+"&nbsp;&nbsp;</td><td><a href="
			+ "\"edit_employee.view?id="+e.getSerialVersionUID()+"\">Edit</a></td><td><a href=\"delete_employee.view?id="+e.getSerialVersionUID()+"\">Delete</a></td>");
		}
		out.println("</table>");
		
	}

}
