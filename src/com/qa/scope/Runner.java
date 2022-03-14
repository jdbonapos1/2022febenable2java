package com.qa.scope;

public class Runner {

	// scope runner demo
	

	public static void main(String[] args) {
		
		Scope myObj = new Scope();
		
		myObj.methodOne();
		myObj.methodTwo();
		myObj.methodTwo("ANOTHER MESSAGE");
		
		System.out.println();
	
}

}