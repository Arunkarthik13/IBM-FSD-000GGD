package collection.list.ex;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.Properties;
	import java.util.Scanner;

	public class JdbcDemo {
		private static Properties properties = null;
		private static Scanner scanner=new Scanner(System.in);
		static {
			properties = new Properties();
			properties.put("JDBC_URL", "jdbc:mysql://localhost:3306/hr");
			properties.put("USER", "root");
			properties.put("PASSWORD", "root");
		}

		public JdbcDemo() {
			super();

		}

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			// register the driver
			/*
			 * 
			 * DriverManager.registerDriver(new org.h2.Driver());
			 * Class.forName("org.h2.Driver");
			 */ 
			 Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root"); 
			 // Connection connection=DriverManager.getConnection(properties.getProperty("JDBC_URL"),
			 // properties.getProperty("USER"),properties.getProperty("PASSWORD")); 
			 Statement statement=connection.createStatement(); 
			 ResultSet resultSet=statement.executeQuery("select * from student");
			 //System.out.println("ID NAME PRICE"); 
			 while(resultSet.next()) {
			 System.out.println(resultSet.getString(1)); 
			 System.out.printf("\n%s",resultSet.getString(1)); 
			 }
			 
			
}
	}
