package com.loops.decisionMakingStatement;

public class IfElseIf {
	
	public static void main(String [] args) {
		
		int marks =20;
		
		if(marks>=90) {
			System.out.println("Grade A");
		}
		else if(marks>=75) {
			System.out.println("Garde B");
		}
		else if(marks>=60){
			System.out.println("Grade C");
		}
		else if(marks>=45) {
			System.out.println("Grade D");
		}
		else {
			System.out.println("Better Luck for next time");
		}
	}

}
