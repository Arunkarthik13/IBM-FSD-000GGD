package Addargs;

public class Addargs1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int m=0;
        for(String a:args)
        {
        	try {
        		m+=Integer.parseInt(a);
        		System.out.println(args[10]);
        	
        	
        	}
        	catch(NumberFormatException e)
        	{
        		System.out.println(e.getMessage());
        		//System.exit(0);
        	}  
        	catch(Exception e)
        	{
        		System.out.println(e.toString());
        	}
        }
        System.out.println(m);
	}

}
