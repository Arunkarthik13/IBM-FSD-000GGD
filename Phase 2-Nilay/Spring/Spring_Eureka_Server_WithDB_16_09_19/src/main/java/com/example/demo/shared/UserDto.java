package com.example.demo.shared;


public class UserDto {

	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String userId;
	private String bcrypetedPassword;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getBcrypetedPassword() {
		return bcrypetedPassword;
	}
	public void setBcrypetedPassword(String bcrypetedPassword) {
		this.bcrypetedPassword = bcrypetedPassword;
	}
	public String getuserId() {
		return userId;
	}
	public void setuserId(String userId) {
		userId = userId;
	}
	
	
}
