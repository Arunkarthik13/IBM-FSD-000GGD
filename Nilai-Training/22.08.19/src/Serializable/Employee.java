package Serializable;

import java.io.Serializable;

public class Employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
  public int id;
  public String name;
  public int salary;
  public String location;
public Employee(int id, String name, int salary, String location) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.location = location;
}
public void setId(int id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public void setLocation(String location) {
	this.location = location;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public int getSalary() {
	return salary;
}
public String getLocation() {
	return location;
}
  
}
