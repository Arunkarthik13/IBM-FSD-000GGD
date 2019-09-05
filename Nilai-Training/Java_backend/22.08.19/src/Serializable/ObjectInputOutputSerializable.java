package Serializable;

import java.io.*;
public class ObjectInputOutputSerializable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
      Employee emp=new Employee(10,"Arun",20000,"Chennai");
      System.out.println("Employee to write is:"+emp);
      FileOutputStream out=new FileOutputStream("employee.out");
      ObjectOutputStream oos=new ObjectOutputStream(out);
      oos.writeObject(emp);
      oos.flush();
      FileInputStream in=new FileInputStream("employee.out");
      ObjectInputStream ois=new ObjectInputStream(in);
      emp=(Employee)(ois.readObject());
      System.out.println("Employee read is:"+emp );
	}

}
