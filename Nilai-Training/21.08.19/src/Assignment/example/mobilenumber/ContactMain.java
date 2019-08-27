package Assignment.example.mobilenumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 
import java.util.Set;
import java.util.TreeSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class ContactMain {
    public static Scanner sc=new Scanner(System.in);
    
	public static void main(String[] args) throws ParseException {
		
    Set<ContactInformation> list=new TreeSet<ContactInformation>();
     
     System.out.println("Enter the number of employees:");
     String totemp=sc.nextLine();
     Date d;
     for(int i=0;i<Integer.parseInt(totemp);i++)
     {  
    	 System.out.println("Enter thye details of Employee"+(i+1));
    	 String name=sc.nextLine();
    	 String email=sc.nextLine();
         String mobile=sc.nextLine();
    	 String address=sc.nextLine();
    	 list.add(new ContactInformation(name,email,Long.valueOf(mobile),address));
     }
     Object[] obj=list.toArray();
     ContactInformation contact=null;
    
	}

}
