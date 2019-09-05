package comm.example;

public class League {
public String lname;
public int year;
public String season;
public League() {
	super();
}
public League(String lname, int year, String season) {
	super();
	this.lname = lname;
	this.year = year;
	this.season = season;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
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
