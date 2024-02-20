package com.javaPolymorphism;

//super class
public class Address 
{
	
	//fields
	
	private String address;
	
	public static final String COUNTRY_NAME = "INDIA";
	
	//default constructor
	public Address() {
		address = "Delhi.";
	}

	//parameterized constructor
	public Address(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static String getCountryName() {
		return COUNTRY_NAME;
	}

	//method with no parameters
	public String getDetails() 
	{
		return "Address [address=" + address + "]";//logic
	}
	
	//method with parameters
	public String getDetails(String address) 
	{
		return "Address [address=" + address + "]";//logic
	}

}
