package com.basic.practice;

public class CallingSMethod {
	
	public static void sm() {
		// static int a=5;  -> not alloweded in a method coz it belongs to the class not to method
		int a=10;
		System.out.println(a);
		a=15;						//re-initailizing var a
	}
	
	public static void sm1() {
		int b=30;
	}
	
	public static void main(String[] args) {
		sm();											//10 -> directly
		CallingSMethod.sm();							//10 -> by class name
		CallingSMethod sm=new CallingSMethod();			//creating obj with same name as method name
		sm.sm();										//then access it
		CallingSMethod obj=new CallingSMethod();			//creating obj
		obj.sm();
		sm();
		
		
	}

}
