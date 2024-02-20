package com.javaObjectClassMethods;

public class Hello {

	public static void main(String[] args)
	{		
		
		String name1 = "Hello";
		String name2 = "Hello";
		String name3 = "Hello World";
		
		System.out.println(name1.equals(name2));//true
		System.out.println(name1.equals(name3));//false
		
		System.out.println("===========================");
		
		Integer value1 = 2020;
		Integer value2 = 2020;
		Integer value3 = 7878;
		
		System.out.println(value1.equals(value2));//true
		System.out.println(value1.equals(value3));//false
		
	}

}
