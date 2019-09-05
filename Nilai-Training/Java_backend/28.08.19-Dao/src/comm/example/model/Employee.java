package comm.example.model;

import java.io.Serializable;

public class Employee implements Serializable{
/**
	 * 
	 */
	public int serialVersionUID = 100;
public String name;
public String password;
public String email;
public String  country;
public Employee(String name, String password, String email, String country,int uid) {
	super();
	this.name = name;
	this.password = password;
	this.email = email;
	this.country = country;
	this.serialVersionUID=uid;
	
}
public Employee() {
	// TODO Auto-generated constructor stub
	super();
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public int getSerialVersionUID() {
	return serialVersionUID;
}

}
