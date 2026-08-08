package com.oops.polymorphism;

class Calculator{
	public int add(int a , int b) {
		return a+b;
	}
	
	public int add(int a,int b,int c) {
		return a+b+c;
	}
}

public class CompileTimePolymorphism {
	public static void main(String[] args) {
		Calculator test=new Calculator();
		System.out.println(test.add(1,2));
		System.out.println(test.add(1,2,3));
	}
}
