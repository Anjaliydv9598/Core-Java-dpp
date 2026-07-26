package com.basic.practice;

public class CallingMethod {
	
	
	
	public static void sm() {
		// static int a=5;  -> not alloweded in a method coz it belongs to the class not to method
		int a=10;
		System.out.println(a);
		}
	
		public static int sm1() {
		int b=30;
		return b;
		}
	
		public void nsm() {
		int c=35;	
		System.out.println(c);
		}
		
	public static void main(String[] args) {
		sm();											//10 -> directly
		CallingMethod.sm();							//10 -> by class name
		CallingMethod sm=new CallingMethod();			//creating obj with same name as method name
		sm.sm();										//then access it
		CallingMethod obj=new CallingMethod();			//creating obj
		obj.sm();
		System.out.println(obj.sm1());	
		obj.nsm();										//calling non static method
		
		
	}

}
