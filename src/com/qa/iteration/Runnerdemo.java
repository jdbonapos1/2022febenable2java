package com.qa.iteration;

public class Runnerdemo {
	
	public static void main(String [] args) {
		
		
		
		//for (int i = 0; i <= 10; i++) {
		//	System.out.println(i);
			
	//	}
		
		boolean flag = true;
		int count = 0;
		
		// while flag == true
		while(flag == true) {
			// System.out.println("I'm looping");
			count++;
			
			if (count > 10) {
				flag = false;
				
				
			}
		}
		
		// do while loop
		do {
			// System.out.println("I'm looping");
			count++;
			
			if (count > 10) {
				flag = false;
			}
		} while (flag);
		
		
		
		
		
	}
	
}

		
		

