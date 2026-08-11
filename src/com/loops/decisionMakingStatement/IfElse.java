package com.loops.decisionMakingStatement;

public class IfElse {

	public static void main(String [] args) {
		
		//the given no is +ve or not
		int num=18;
		
		if(num>=0) {
			System.out.println("The given number is positive .");
		}
		else {
			System.out.println("The given number is negative .");
		}
		
		
		
		
		// if sal is greater than 10,000 then add 2000 if not then add 1000
		int salary = 24000;
		
		if(salary>10000) {
			salary=salary+2000;
		}else {
			salary=salary+1000;
		}
		System.out.println(salary);
		
		
		
		
		
	}
}
