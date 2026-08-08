package com.oops.inheritance;

// Hybrid Inheritance
//Java does NOT support hybrid inheritance using classes directly. But we can achieve it using interfaces + inheritance ,Because it would lead to ambiguity (diamond problem), so Java uses interfaces to handle it safely.

//Base class
class Employee{
	public void work() {
		System.out.println("Employee is working");
	}	}

//Child 1
class Developer extends Employee{
	public void code() {
		System.out.println("Developer is coding");
	}	}

//Child 2
class Tester extends Employee{
	public void test() {
		System.out.println("Tester is testing");
	}	}

//Interface
interface Company{
	public abstract void CompanyDetails();
}

//Hybrid class (Hierarchical + Interface)
class TechLead extends Developer implements Company{
	@Override
	public void CompanyDetails() {
		System.out.println("Company Name : Tech Corp ");
	}
	public void manage() {
		System.out.println("TechLead is managing team");
	}
}

//Main class
public class HybridInheritance {
public static void main(String[] args) {
	TechLead t=new TechLead();
	t.work();								 // from Employee
	t.code();								// from Developer
//	t.test();								//Child class cannot access sibling class methods because inheritance only works in a parent-child hierarchy, not between parallel classes
	t.CompanyDetails();						// own method
	t.manage();								// from interface
}
}
