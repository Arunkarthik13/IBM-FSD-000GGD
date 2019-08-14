package enum1.ex;

public class Tenniscoach implements Coach{
private String name;
private Enumeration e;

public Tenniscoach() {
	super();
	
}

public void createcoach(String name,Enumeration e)
{
	this.name=name;
	this.e=e;
}

public void setName(String name) {
	this.name = name;
}

public void setE(Enumeration e) {
	this.e = e;
}

public String getName() {
	return name;
}

public Enumeration getE() {
	return e;
}
@Override
public String getdetailsWorkout() {
	// TODO Auto-generated method stub
	return "We are going to play volley ball today";
}
public String getCoachdetails()
{
	StringBuilder sb=new StringBuilder();
	sb.append("Today plan is:"+getdetailsWorkout()+"\n");
	sb.append("name:"+getName()+"\n");
	sb.append("level:"+e+"\n");
	sb.append("Rank:"+e.getlevelcode()+"\n");
	return sb.toString();
	
}






}
