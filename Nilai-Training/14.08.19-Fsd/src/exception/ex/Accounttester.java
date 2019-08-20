package exception.ex;

import java.util.Scanner;

public class Accounttester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the name");
      String name=sc.nextLine();
      System.out.println("Enter the salary");
      int salary=sc.nextInt();
      Account a=new Account(name,salary);
      Account a1=new Account(name,salary);      
      try
      {
    	  if(a.equals(a1))
    	  {
    		  throw new AccountException("Account is invalid");
    		 
    	  }
      }
      catch(AccountException e)
      {
    	  System.out.println(e.getMsg());
      }
	}

}
