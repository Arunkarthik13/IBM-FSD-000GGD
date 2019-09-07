package jframepredefined;

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

public ResultSet getEmployees() throws SQLException
{
	Statement st=connection.createStatement();
	ResultSet rs=st.executeQuery("select id as Id,firstName as FirstName,lastName as LastName,email as Email from employee");
	return rs;
}

}
