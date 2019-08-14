package collections.ex;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Collections {
static Scanner sc=new Scanner(System.in);
private String str[];
private Set set;
public Collections()throws InputMismatchException 
{
	super();
	System.out.println("number of elements in the array");
	str=new String[sc.nextInt()];
	for(int i=0;i<str.length;i++)
	{
		System.out.println("Name:");
		str[i]=sc.next().toString().toLowerCase();
	}
	set=new HashSet();
	for(String s:str)
	{
		if(!(set.add(s)))
		{
			System.out.println("Duplicate element can't be added"+s);
		}
	}
}
public void displaycollection()
{
	Iterator ite=new HashSet();
}


}
