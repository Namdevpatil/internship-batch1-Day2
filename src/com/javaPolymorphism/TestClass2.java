package com.javaPolymorphism;

public class TestClass2 {

	public static void main(String[] args) {

		Address address11 = new Address();

		System.out.println(address11.getDetails());

		System.out.println("------------------------------------------------------------------------");

		Address address12 = new Address();

		System.out.println(address12.getDetails());

		System.out.println("=========================================================================");

		Address address1 = new Address("Ameerpet, Hyderabad");

		System.out.println(address1.getDetails());

		System.out.println("------------------------------------------------------------------------");

		Address address2 = new Address("Nampally, Hyderabad");

		System.out.println(address2.getDetails());

	}

}
