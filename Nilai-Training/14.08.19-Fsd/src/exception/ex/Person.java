package exception.ex;

public class Person {
private String fname=null;
private String lname=null;

public Person() {
	super();
}
public Person(String fname, String lanme) {
	super();
	this.fname = fname;
	this.lname = lname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public void setLanme(String lname) {
	this.lname = lname;
}
public String getFname() {
	return fname;
}
public String getLanme() {
	return lname;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Person [firstname="+fname+",Lastname="+lname+"]";
}
public Person verifyname(String fname,String lname)throws Personexception
{
	this.fname=fname;
	this.lname=lname;
	if(!Character.isUpperCase(fname.charAt(0))||!Character.isUpperCase(lname.charAt(0)))
	{
		throw new Personexception("Name is not valid");
		//System.out.println("Not Valid");
	}
	return new Person(fname,lname);
}


}
