package com.javaAbstraction;

public class Dog extends Animal
{
	
	//fields
	private String name;
	private String animalType;
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	
	public Dog(String name, String animalType) 
	{
		this.name = name;
		this.animalType = animalType;
	}
	
	@Override
	public String getDetails() 
	{
		return this.name+" | "+this.animalType;		
	}	

}
