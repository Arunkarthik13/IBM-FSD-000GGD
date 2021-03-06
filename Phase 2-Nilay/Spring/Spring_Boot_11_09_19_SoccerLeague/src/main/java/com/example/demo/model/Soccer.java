package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Soccer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int id;
	public String title;
	public String session;
	public int year;
	
	
	public Soccer() {
		super();
	}
	public Soccer(String title, String session, int year) {
		super();
		this.title = title;
		this.session = session;
		this.year = year;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
    
	
}
