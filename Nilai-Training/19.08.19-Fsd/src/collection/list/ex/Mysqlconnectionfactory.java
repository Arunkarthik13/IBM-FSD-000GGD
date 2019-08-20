package collection.list.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mysqlconnectionfactory {
	
	private static Connection connection=null;
	private static Mysqlconnectionfactory connectionFactory;
	
	private Mysqlconnectionfactory()throws SQLException
	{
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
	}
	
	
	public static Mysqlconnectionfactory createConnection()throws SQLException
	{
		if(connectionFactory==null)
		{
			connectionFactory=new Mysqlconnectionfactory();
		}
		return connectionFactory;
	}
	public Connection getConnection()throws SQLException
	{
		return connection;
	}

}
