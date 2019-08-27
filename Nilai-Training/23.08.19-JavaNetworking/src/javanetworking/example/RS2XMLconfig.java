package javanetworking.example;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sun.corba.se.pept.transport.Connection;

import comm.example.factory.MyConnectionFactory;

public class RS2XMLconfig {
private MyConnectionFactory factory;
private java.sql.Connection connection;
public RS2XMLconfig() throws SQLException {
	super();
	factory=MyConnectionFactory.createObject();
	connection=factory.getConnection();
}

public ResultSet getEmployeeById(int id) throws SQLException
{
	Statement st=connection.createStatement();
	ResultSet rs=st.executeQuery("select id as Id,firstName as FirstName,lastName as LastName,email as Email from employee where id="+id);
	return rs;
}

}
