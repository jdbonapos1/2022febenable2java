package com.qa.oop.encapsulation;

public class Runner {
	
	

	public static void main(String[] args) {
		
		Person jd = new Person("jd", "developer", 21);
		Person tin = new Person("tin", "artist", 15 );
		Person erika = new Person("erika","model", 19);
		
		jd.age = 241;
		
		System.out.println(jd.age);
				
		
		
	}

}


