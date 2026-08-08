package com.oops.polymorphism;

class Payment{
	public void pay() {
		System.out.println("Processing Payment ...");
	}	
}

class CreditCard extends Payment{
	@Override
	public void pay() {
		System.out.println("Payment done using Credit Card");
	}	
}

class UPI extends Payment{
	@Override
	public void pay() {
		System.out.println("Payment done using UPI");
	}
}

public class RunTimePolymorphism {
	public static void main(String[] args) {
		Payment p;
		p=new CreditCard();
		p.pay();
		
		p=new UPI();
		p.pay();	//Method call depends on object type, not reference type 
	}

}
