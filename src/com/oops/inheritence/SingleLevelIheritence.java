package com.oops.inheritence;

	class Animal{
		
		public void eat() {
			System.out.println("Animal is eating : Parent class");
		}
		
	}


	class Dog extends Animal{
		
		public void sound() {
			System.out.println("Dog is barking : Child class");
		}
	}
	

public class SingleLevelIheritence {
	
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.eat();	
//		animal.sound();		-> we can't achieve by the help of parent reference
		
		Dog dog = new Dog();
		dog.eat();
		dog.sound();
		
		Animal a=new Dog();		
		a.eat(); 
//		a.sound();		-> we can't achieve child properties by the help of parent reference coz of upcasting that's why we go for downcasting
//		Method access depends on reference type, not object type. So parent reference cannot access child-specific methods
		
		if(a instanceof Dog) {
			Dog d= (Dog) a;//downcasting		or Dog d= (Dog)newDog();
			d.eat();
			d.sound();
		}
		
	}

}
