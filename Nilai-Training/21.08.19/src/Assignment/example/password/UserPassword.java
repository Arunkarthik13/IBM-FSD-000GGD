package Assignment.example.password;

public class UserPassword {
	public static int lower=0;
	public static int upper=0;
	public static int digit=0;
	public static int special=0;
	public static boolean checkPassword(String password)
	{
		for(int i=0;i<password.length();i++)
		{
			if(Character.isUpperCase(password.charAt(i)))
			{
		        lower++;
			}
			else if(Character.isLowerCase(password.charAt(i)))
			{
		        upper++;
			}
			else if(Character.isDigit(password.charAt(i)))
			{
		        digit++;
			}
			else
			{
				special++;
			}
		}
		if(password.length()>=8&&lower>=1&&upper>=1&&digit>=1&&special>=1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
