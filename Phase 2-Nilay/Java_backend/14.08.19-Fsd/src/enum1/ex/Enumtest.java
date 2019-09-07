package enum1.ex;
import static java.lang.System.in;
import static java.lang.System.out;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.err;

public class Enumtest {
    
	private static Scanner sc=new Scanner(in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String name=null;
          try {
        	  out.print("Coach name:");
        	  name=sc.next();
        	  Tenniscoach my=new Tenniscoach();
        	  my.createcoach(name,Enumeration.MEDIUM);
        	  out.println(my.getCoachdetails().toString());
        	  
          }
          catch(InputMismatchException e) 
          {
        	  e.printStackTrace();
        	  err.println(e.toString());
          }
	}

}
