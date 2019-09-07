package Assignment.example;

import java.util.Date;

public class Employee implements Comparable{
	private int id;
	private String name;
	private String department;
	private Date dateOfJoining;
	private int age;
	private int salary;
	public Employee(int id, String name, String department, Date dateOfJoining, int age, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.dateOfJoining = dateOfJoining;
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
		Employee emp=(Employee)obj;
		if(this.getSalary()==emp.getSalary())
		{
			return 0;
		}
		else if ((this.getSalary()>emp.getSalary())) {
			return 1;
		}
		else  {
			return -1;
		}
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", dateOfJoining="
				+ dateOfJoining + ", age=" + age + ", salary=" + salary + "]";
	}
	
	

}
