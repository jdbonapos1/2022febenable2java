package com.qa.constructors;

public class Runner {

	public static void main(String[] args) {

		// Static members can be accessed through the class itself
		// Y
		Person.sleep();
		
		
		Person JD = new Person("JD", 21, 9);
		System.out.println("Name: " + JD.name);
		System.out.println("Age: " + JD.age);
		System.out.println("Shoe Size: " + JD.shoeSize);
		JD.eat();
		
		System.out.println();
		
	
		// This constructor will use default values
		Person p = new Person();
		System.out.println("Name: " + p.name);
		System.out.println("Age: " + p.age);
		System.out.println("Shoe Size: " + p.shoeSize);
		p.eat();
	
	
}
