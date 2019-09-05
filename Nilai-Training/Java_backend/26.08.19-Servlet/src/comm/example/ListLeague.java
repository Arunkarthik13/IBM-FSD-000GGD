package comm.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListLeague
 */
@WebServlet("/list_league.view")
public class ListLeague extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		processRequest(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		List<League> list=new ArrayList<League>();
		list.add(new League("Soccer League",2009,"Summer"));
		list.add(new League("Swiming League",2019,"Summer"));
		list.add(new League("Basket Ball League",2009,"Autumn"));
		list.add(new League("Beach Volley",2015,"Winter"));
		out.println("<table><tr><td>Name</td><td>Year</td><td>Season</td></tr>");
		for(League l:list)
		{
			out.println("<tr><td>"+l.getLname()+"</td><td>"+
		     l.getYear()+"</td><td>"+l.getSeason()+"</td></tr>"); 
		}
		out.println("</table>");
		
	}

}
