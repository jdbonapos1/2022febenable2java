package com.qa.helloworld;

public class Runner {
	
	// Demo
	 //  main method entry point for execution of our program.
		
	public static void main(String[] args) {
			HelloWorld myObj = new HelloWorld();
			
			myObj.helloworld();
			myObj.printMessage("Hello World", "This is more text", 10);
			
			String myResult = myObj.concatText("Hello", "World");
			System.out.println(myResult);

		

}

}
