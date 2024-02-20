package com.javaPolymorphism;

public class TestClass {

	public static void main(String[] args) {
		
		Patient patient = new Patient(6677, "Jayesh Kumar", "Lever Problem", 89768.89);
		
		System.out.println(patient.getDetails());
		
		System.out.println("------------------------------------------------------------------------");
		
		Address address = new Address("Nampally, Hyderabad");
		
		System.out.println(address.getDetails());

	}

}
