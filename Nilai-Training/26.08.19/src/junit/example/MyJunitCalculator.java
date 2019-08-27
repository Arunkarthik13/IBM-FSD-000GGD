package junit.example;

public class MyJunitCalculator {
public int x;
public int y;
public int result;
public MyJunitCalculator(int x, int y) {
	super();
	this.x = x;
	this.y = y;
}
public int addMethod()
{
	result=x+y;
	return result;	
}
public int subMethod()
{
	result=x-y;
	return result;
}
public int compare()
{
	if(x>y)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}
}
