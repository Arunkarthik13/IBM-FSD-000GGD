package collection.list.ex;

public class Student implements Comparable{
public String fname;
public String lname;
public double gpa;

public void setFname(String fname) {
	this.fname = fname;
}

public void setLname(String lname) {
	this.lname = lname;
}

public void setGpa(double gpa) {
	this.gpa = gpa;
}

public String getFname() {
	return fname;
}

public String getLname() {
	return lname;
}

public double getGpa() {
	return gpa;
}

@Override
public int compareTo(Object obj) {
	// TODO Auto-generated method stub
	Student student=(Student)obj;
	if(this.getGpa()==student.getGpa())
	{
		return 0;
	}
	else if ((this.getGpa()>student.getGpa())) {
		return 1;
	}
	else  {
		return -1;
	}
}

}
