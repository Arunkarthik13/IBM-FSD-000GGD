package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private int hourlyPaid;
	private int commission;	
	private double salary;
	private int contractPeriod;
	public Employee(String firstName, String lastName, String email, int hourlyPaid, int commission, double salary,
			int contractPeriod) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.hourlyPaid = hourlyPaid;
		this.commission = commission;
		this.salary = salary;
		this.contractPeriod = contractPeriod;
	}
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
	public int getHourlyPaid() {
		return hourlyPaid;
	}
	public void setHourlyPaid(int hourlyPaid) {
		this.hourlyPaid = hourlyPaid;
	}
	public int getCommission() {
		return commission;
	}
	public void setCommission(int commission) {
		this.commission = commission;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getContractPeriod() {
		return contractPeriod;
	}
	public void setContractPeriod(int contractPeriod) {
		this.contractPeriod = contractPeriod;
	}
	
	
	
}
