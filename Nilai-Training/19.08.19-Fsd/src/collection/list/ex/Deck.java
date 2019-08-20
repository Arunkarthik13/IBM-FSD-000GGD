
package collection.list.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.*;
public class Deck {
 
private static List<Card> pro=new ArrayList<Card>();

 static {
	
	 for(Suit s:Suit.values())
	 {
		 for(Rank r:Rank.values())
		 {
			 pro.add(new Card(s,r));
		 }
	 }
	 Collections.shuffle(pro);
	 
 }
 
 public static void main(String[] args)
 {
	 ListIterator<Card> iterator=pro.listIterator();
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the suit no:");
	 int a=sc.nextInt();
	 System.out.println("Enter the Rank no:");
	 int b=sc.nextInt();
	 for(int i=0;i<a;i++)
	 {
		 System.out.println("player:"+(i+1));
		 for(int j=0;j<b;j++)
		 {
			 System.out.println(iterator.next());
		 }
	 }
	 
 }
}
