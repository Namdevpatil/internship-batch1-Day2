package com.javaAbstraction;

public class TestClass {

	public static void main(String[] args) {
		
		//Cannot instantiate the type Animal
		//Animal animal = new Animal();
		
		Dog dog = new Dog("XYZ", "Pet");
		System.out.println(dog.getDetails());

	}

}
