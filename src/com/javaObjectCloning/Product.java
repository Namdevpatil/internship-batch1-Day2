package com.javaObjectCloning;


//step1: the class should implements Cloneable interface 
public class Product implements Cloneable
{

	private int id;
	private String name;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() 
	{
		return "Product [id=" + id + ", name=" + name + "]";
	}
	//step2: declare the CloneNotSupportedException class
	public static void main(String[] args)throws CloneNotSupportedException 
	{
		Product product1 = new Product(2020, "XYZ");//original object		
		System.out.println(product1.toString());
		
		System.out.println("================================================");
		
		Product productObjectCopy = (Product)product1.clone();//copy of the original object
		System.out.println(productObjectCopy.toString());
		
	}
	
}
