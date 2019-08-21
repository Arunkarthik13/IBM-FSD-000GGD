package Assignment.example.password;

import java.util.Scanner;

public class PasswordMain {
    public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter the password:");
		String password=sc.nextLine();
		boolean b=UserPassword.checkPassword(password);
		if(b==true)
		{
			System.out.println("Valid Password");
			System.exit(0);
		}
		else
		{
			System.out.println("Invalid Password");
			System.exit(0);
		}
		
	}
}
