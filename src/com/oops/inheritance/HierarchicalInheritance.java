package com.oops.inheritance;

class Fruit{
	int price =90;
	String region = "India";
	
	void fruitDetail() {
		System.out.println(price);
		System.out.println(region);
	}
}

class Apple extends Fruit{
	String name="Apple";
	String color = "red";
	
	void appleDetail() {
		System.out.println(name);
		System.out.println(color);
	}
}

class Mango extends Fruit{
	int total=5;
	void mangoDetail() {
		System.out.println(total);
	}
}


public class HierarchicalInheritance {
	public static void main(String[] args) {
		Fruit f = new Fruit();
		System.out.println(f.price);
		System.out.println(f.region);
		f.fruitDetail();
		System.out.println("==============================================================================================");
		
		Apple a = new Apple();
		System.out.println(a.name);
		System.out.println(a.color);
		System.out.println(a.price);
		System.out.println(a.region);
		a.appleDetail();
		a.fruitDetail();
		System.out.println("==============================================================================================");
		
		Mango m=new Mango();
		System.out.println(m.total);		System.out.println(m.price);	System.out.println(m.region);
//		System.out.println(m.name);         System.out.println(m.color);	m.appleDetail(); -> we can't access it coz there's no reln b/w them
		m.mangoDetail();
		m.fruitDetail();
		
		
	}
	
}
