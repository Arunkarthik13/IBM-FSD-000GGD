package com.cdexample;
import java.io.*;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("international_id")
public class InternationalCD extends CD{
private String languages;
private int region;

public InternationalCD(String title,String author,Date date,double cost,String languages, int region) {
	super(title,author,date,cost);
	this.languages = languages;
	this.region = region;
}

public String getLanguages() {
	return languages;
}

public void setLanguages(String languages) {
	this.languages = languages;
}

public int getRegion() {
	return region;
}

public void setRegion(int region) {
	this.region = region;
}

}
