package exception.ex;

public class Persontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Person p=new Person();
      try
      {
    	  p.verifyname("Arun","Kumar");
    	  System.out.println(p.toString());
      }
      catch(Personexception e)
      {
    	  System.err.println(e.getMessage());
      }
	}

}
