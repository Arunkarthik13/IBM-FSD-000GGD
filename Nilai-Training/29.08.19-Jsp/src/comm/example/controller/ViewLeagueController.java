package comm.example.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.example.factory.MyConnectionFactory;
import comm.example.model.League;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 * Servlet implementation class ViewLeagueController
 */
@WebServlet("/view_league.view")
public class ViewLeagueController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private Statement statement=null;  
    private ResultSet rs=null;
    private Connection connection=null;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			processRequest(request,response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      try {
		processRequest(request,response);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 

	}

	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException {
		List<League> list=new ArrayList<League>();
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		connection=MyConnectionFactory.getMySqlConnectionForHR();
		statement=connection.createStatement();
		rs=statement.executeQuery("select * from league");
		out.println("<table><tr><td>Title</td><td>Season</td><td>Year</td><td>Unique Id</td></td>");
		while(rs.next())
		{
			out.println("<tr><td>"+rs.getString(2)+
					"</td><td>"+rs.getString(3)+"</td><td>"+rs.getInt(4));
		}
		out.println("</table>");
		
		
	}

}
