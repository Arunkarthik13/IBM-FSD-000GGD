package comm.example.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class League implements Serializable{
/**
	 * 
	 */
	@SuppressWarnings("unused")
	public static int serialVersionUID = 100;

public String title;
public int year;
public String season;
public League(String title, int year, String season) {
	super();
	this.title = title;
	this.year = year;
	this.season = season;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public String getSeason() {
	return season;
}
public void setSeason(String season) {
	this.season = season;
}

}
