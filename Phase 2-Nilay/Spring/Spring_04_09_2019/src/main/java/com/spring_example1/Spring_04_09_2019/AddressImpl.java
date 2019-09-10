package com.spring_example1.Spring_04_09_2019;
import com.spring_example1.Spring_04_09_2019.bean.Address;

public class AddressImpl implements Address {
private String street;
private int pincode;
private String district;

	public AddressImpl(String street, int pincode, String district) {
	super();
	this.street = street;
	this.pincode = pincode;
	this.district = district;
}
	

	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public int getPincode() {
		return pincode;
	}


	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


	public String getDistrict() {
		return district;
	}


	public void setDistrict(String district) {
		this.district = district;
	}


	@Override
	public String toString() {
		return "AddressImpl [street=" + street + ", pincode=" + pincode + ", district=" + district + "]";
	}


	public String getAddress() {
		
		return toString();
	}

}
