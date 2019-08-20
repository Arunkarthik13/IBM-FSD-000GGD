package threadexample;

public class Mythreadclass implements Runnable{

	public static void main(String[] args) {
		Mythreadclass mythread=new Mythreadclass();
		Mythreadclass2 mythread1=new Mythreadclass2();
		Thread t1=new Thread(mythread);
		Thread t2=new Thread(mythread1);
		t1.start();
		System.out.println(t1.isAlive());
		t2.start();
		try
		{
			t1.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		System.out.println(t2.isAlive());
			

	}

	@Override
	public void run() {
		try
		{
			for(int i=0;i<20;i++)
		{
			System.out.println("i=>"+i);
			if(i==10)
			{
				Thread.sleep(2000);
			}
		}
		}
		catch(Exception e)
		{
			
		}
		
	}

}
