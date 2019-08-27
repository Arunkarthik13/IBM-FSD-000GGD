package junit.example;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class JunitTestCalculator extends TestCase{
    public int x;
    public int y;
	
	
	
	public JunitTestCalculator(String name) {
		super(name);
	}

	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		System.out.println("Initialize method");
		x=30;
		y=20;
	}

	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
		System.out.println("clean-up method");
		x=0;
		y=0;
	}

	@Test
	public void testaddMethod() {
		System.out.println("Its add method");
		MyJunitCalculator junit=new MyJunitCalculator(x, y);
		assertEquals(50,junit.addMethod());
	}
	@Test
	public void testsubMethod() {
		System.out.println("Its subtract method");
		MyJunitCalculator junit=new MyJunitCalculator(x, y);
		assertEquals(10,junit.subMethod());
	}
	@Test 
	public void testcompare() {
		System.out.println("Its compare method");
		MyJunitCalculator junit=new MyJunitCalculator(x, y);
		assertEquals(1,junit.compare());
	}
	public static TestSuite createSuite()
	{
		TestSuite testsuite=new TestSuite("AllTests");
		testsuite.addTest(new JunitTestCalculator("testaddMethod"));
		testsuite.addTest(new JunitTestCalculator("testsubMethod"));
		//testsuite.addTest(new JunitTestCalculator("testcompare"));
		return testsuite;		
		
	}  
	
	public static void main(String[] args)
	{
	junit.textui.TestRunner.run(JunitTestCalculator.class);
	junit.textui.TestRunner.run(createSuite());
	}

}
