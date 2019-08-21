package Assignment.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Employeemain {
    public static Scanner sc=new Scanner(System.in);
    
	public static void main(String[] args) throws ParseException {
		
    Set<Employee> list=new TreeSet<Employee>();
     List<Agecomparator> ageadd=new ArrayList<Agecomparator>();
     
     EmployeeBO empbo=new EmployeeBO();
     
     System.out.println("Enter the number of employees:");
     String totemp=sc.nextLine();
     Date d;
     for(int i=0;i<Integer.parseInt(totemp);i++)
     {  
    	 System.out.println("Enter thye details of Employee"+(i+1));
    	 String name=sc.nextLine();
    	 String dept=sc.nextLine();
         String date=sc.nextLine();
    	 SimpleDateFormat s=new SimpleDateFormat("dd/MM/yyyy");
    	 String age=sc.nextLine();
    	 String salary=sc.nextLine();
    	 d=s.parse(date);
    	 list.add(new Employee((i+1),name,dept,d,Integer.parseInt(age),Integer.parseInt(salary)));
    	 ageadd.add(new Agecomparator((i+1),name,dept,d,Integer.parseInt(age),Integer.parseInt(salary)));
     }
     Object[] obj=list.toArray();
     Object[] obj1=ageadd.toArray();
     //Employee e=null;
     int choice=0;
     do {
    	 System.out.println("Sort by salary");
    	 System.out.println("Sort by age and date of joining");
    	 System.out.println("Enter your choice:");
    	 choice=sc.nextInt();
    	  switch(choice)
    	  {
    	  case 1:empbo.SortbySalary(obj);
    		     break;
    	  case 2:empbo.SortbyAge(obj1);
    	         break;
    	  case 0:System.out.println("You can exit");
    	         System.exit(0);
    	         break;
    	  default:System.out.println("Invalid choice");
    	          break;
    	  }
     }while(choice!=0);
	}

}
