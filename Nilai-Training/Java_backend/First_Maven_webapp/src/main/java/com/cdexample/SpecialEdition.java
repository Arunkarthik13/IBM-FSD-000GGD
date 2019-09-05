package com.cdexample;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("specialedition_cd")

public class SpecialEdition extends CD{
public String newfeature;

public SpecialEdition(String title,String author,Date date,double cost,String newfeature) {
	super(title,author,date,cost);
	this.newfeature = newfeature;
}

public String getNewfeature() {
	return newfeature;
}

public void setNewfeature(String newfeature) {
	this.newfeature = newfeature;
}

}
