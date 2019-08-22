package comm.example;

import java.io.*;
import java.sql.SQLException;

import comm.example.model.Employee;
import comm.example.service.EmployeeService;
import comm.example.service.EmployeeServiceImpl;

public class FilestreamWithDB {
	
	public static void main(String[] args) throws SQLException, IOException {
		try {
			EmployeeService service=new EmployeeServiceImpl();
			BufferedReader reader=new BufferedReader(new FileReader("FileStreamDB.txt"));
			String line=reader.readLine();
			while(line!=null)
			{
				String[] db=line.split(" ");
				service.createEmployee(new Employee(Integer.parseInt(db[0]),db[1],db[2],db[3]));
				line=reader.readLine();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
