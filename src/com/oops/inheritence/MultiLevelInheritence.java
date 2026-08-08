package com.oops.inheritence;

class GrandFather{
	public static void gfDetail() {
		System.out.println("Grandfather");
	}
}

class Parent extends GrandFather{
	public static void pDetail() {
		System.out.println("Parent");
	}
}

class Child extends Parent{
	public static void cDetail(){
		System.out.println("Child");
	}
}

public class MultiLevelInheritence {
	public static void main(String[] args) {
	 GrandFather g= new GrandFather();
	 g.gfDetail();
	 
	 Parent p=new Parent();
	 p.pDetail();
	 p.gfDetail();
	 
	 Child c=new Child();
	 c.cDetail();
	 c.pDetail();
	 c.gfDetail();
	}
}
