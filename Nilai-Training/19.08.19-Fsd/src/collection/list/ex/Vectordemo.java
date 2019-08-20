package collection.list.ex;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;
public class Vectordemo {
  private Vector<String> vector;
  
  public Vectordemo()
  {
	  vector=new Vector<String>();
	  vector.add("Arun");
	  vector.add("KArthik");
	  vector.add("Kumar");
	  Enumeration<String> e=vector.elements();
	  while(e.hasMoreElements())
	  {
		  System.out.println(e.nextElement());
	  }
	  
  }
}
