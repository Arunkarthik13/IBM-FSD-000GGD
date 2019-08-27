package Assignment.example.mobilenumber;

public class ContactInformation implements Comparable{
	public String name; 
	public  String email; 
	public long mobile;
	public  String address;
	public ContactInformation(String name, String email, long mobile, String address) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public long getMobile() {
		return mobile;
	}
	public String getAddress() {
		return address;
	}
	@Override
	public int compareTo(Object o) {
		ContactInformation contact=(ContactInformation)o;
		if(this.getMobile()==contact.getMobile())
		{
			return 0;
		}
		else if (this.getMobile()>contact.getMobile())
		{
			return 1;
		}
		else  {
			return -1;
		
	}

}
}
