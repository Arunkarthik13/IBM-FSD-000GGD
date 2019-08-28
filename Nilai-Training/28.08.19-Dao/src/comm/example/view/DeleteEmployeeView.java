package comm.example.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.example.dao.EmployeeDao;
import comm.example.dao.EmployeeDaoImpl;

/**
 * Servlet implementation class DeleteEmployeeView
 */
@WebServlet("/delete_employee.view")
public class DeleteEmployeeView extends HttpServlet {
	EmployeeDaoImpl ser=new EmployeeDaoImpl();
	private static final long serialVersionUID = 1L;
    public int id;
    public DeleteEmployeeView() {
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
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		id=Integer.parseInt(request.getParameter("id"));
		try {
			ser.deleteEmployee(id);
			RequestDispatcher view=request.getRequestDispatcher("view_employee.view");
			view.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
