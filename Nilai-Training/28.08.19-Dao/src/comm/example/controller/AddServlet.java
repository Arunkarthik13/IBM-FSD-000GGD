package comm.example.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddEmployee
 */
@WebServlet("/add_servlet.do")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
	}

	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<title>Add employee detail here</title>");
		out.println("<form action=\"add_employee.view\" method=\"post\">");
		out.println("<label for=\"Name\">Name:</label>");
		out.println("<input id=\"Name\" name=\"Name\" required=\"true\" type=\"text\"/><br><br>");
		out.println("<label for=\"Password\">Password:</label>");
		out.println("<input id=\"Password\" name=\"Password\" required=\"true\" type=\"password\"/><br><br>");
		out.println("<label for=\"Email\">Email:</label>");
		out.println("<input id=\"Email\" name=\"Email\" required=\"true\" type=\"email\"/><br><br>");
		out.println("<select name=\"country\">\r\n" + 
				"<option value=\" \">select</option>\r\n" + 
				"<option value=\"India\">India</option>\r\n" + 
				"<option value=\"America\">America</option>\r\n" + 
				"<option value=\"England\">England</option>\r\n" + 
				"<option value=\"China\">China</option>\r\n" + 
				"</select><br><br>");
		out.println("<input type=\"submit\" value=\"Save employee\" id=\"save\"/></form><br><br>");
		out.println("<input type=\"reset\" value=\"Reset\" id=\"Reset\"/>");
		out.println("<a href=\"view_employee.view\">View All Employee</a>");
		
		
		
		
	}

}
