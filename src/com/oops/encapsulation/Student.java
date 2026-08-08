package com.oops.encapsulation;

public class Student {
	
	private int rollno;
	private String name;
	private double marks;
	
	public  void setRollno(int rollno) {
		this.rollno=rollno;
	}
	
	public int getRollno() {
		return rollno;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setMarks(double marks) {
		this.marks=marks;
	}
	
	public double getMarks() {
		return marks;
	}
	
	
	public static void main(String[] args) {
	
		Student s = new Student();
		
		s.setRollno(101);
		s.setName("Anjali");
		s.setMarks(89);
	
		System.out.println("Roll no : "  + s.getRollno());
		System.out.println("Name : " + s.getName());
		System.out.println("Marks : " + s.getMarks());
	
	}
	

}
