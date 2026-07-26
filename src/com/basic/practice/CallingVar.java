package com.basic.practice;

public class CallingVar {
	
	static int a=5;
	int b=10;
	
	
	public static void main(String[] args) {
		//access var a
		System.out.println(CallingVar.a);			//5 -> Using Class Name
		System.out.println(a);						//5 -> Direct Access
		CallingVar obj=new CallingVar();			//Using Object
		int var=obj.a;		
		System.out.println(var);
		a=15;
		System.out.println(a);						//accesing via re-initialzation
		
		
		//access var b
		System.out.println(obj.b);
		//b=20;										Static methods cannot access non-static variables directly & b belongs to an object, not the class
		obj.b=20;
		System.out.println(obj.b);
		
	}

}
