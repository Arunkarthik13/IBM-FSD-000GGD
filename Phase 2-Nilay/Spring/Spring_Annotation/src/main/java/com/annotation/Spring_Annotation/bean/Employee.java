package com.annotation.Spring_Annotation.bean;

public class Employee {
public int id;
public String fname;
public String lname;
public String email;
public Employee(int id, String fname, String lname, String email) {
	super();
	this.id = id;
	this.fname = fname;
	this.lname = lname;
	this.email = email;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + "]";
}


}
