package Assignment.example;

import java.util.Date;

public class Agecomparator implements Comparable{
	int id;
	String name;
	String department;
	Date dateOfJoining;
	int age;
	int salary;
	public Agecomparator(int id, String name, String department, Date date, int age, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.dateOfJoining = date;
		this.age = age;
		this.salary = salary;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDepartment() {
		return department;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public int getAge() {
		return age;
	}
	public int getSalary() {
		return salary;
	}
	@Override
	public int compareTo(Object obj) {
		Agecomparator age1=(Agecomparator)obj;
		if(this.getAge()==age1.getAge())
		{
		      if((this.getDateOfJoining()==age1.getDateOfJoining()))
		      {
		    	  return 0;
		      }
		      else if((this.getDateOfJoining()==age1.getDateOfJoining()))
		      {
		    	  return 1;
		      }
		      else
		      {
		    	  return -1;		    	  
		      }
		}
		else if ((this.getAge()>age1.getAge())) {
			return 1;
		}
		else  {
			return -1;
		}
	}
	

}
