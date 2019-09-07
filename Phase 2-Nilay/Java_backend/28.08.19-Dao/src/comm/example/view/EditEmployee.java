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

import comm.example.model.Employee;

@WebServlet("/edit_employee.view")
public class EditEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public int id;
  
    public EditEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processReq(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          processReq(request,response);
	}

	private void processReq(HttpServletRequest request, HttpServletResponse response) throws IOException {
		List<Employee> list=new ArrayList<Employee>();
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		id=Integer.parseInt(request.getParameter("id"));
		
		
	}

}
