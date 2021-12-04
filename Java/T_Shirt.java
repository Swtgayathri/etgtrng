package com.sonata;

public class T_Shirt {
	String color;
	String material;
	String design;
	String Size;
	
	public T_Shirt(String cr,String ml,String dn,String se) {
		this.color=cr;
		this.material=ml;
		this.design=dn;
		this.Size=se;
	}
	public void small() {
		System.out.println("T_Shirt Size is Small");
	}
	public void medium() {
		System.out.println("T_Shirt Size is Meduim");

	}
	public void Large() {
		System.out.println("T_Shirt Size is Large");
	}
	
	public void display() {
		System.out.println("color:"+color);
		System.out.println("Design:"+design);
		
		System.out.println("size:"+Size);
	
	}
	public static void main(String [] args) {
		T_Shirt t1=new T_Shirt("yellow","Velvet","Formal","S");
		System.out.println();
		t1.display();
		t1.small();
		T_Shirt t2=new T_Shirt("White","Wool","Causual","M");
		System.out.println();
		t2.display();
		t2.medium();
		T_Shirt t3=new T_Shirt("Black","Silk","Cocktail","L");
		System.out.println();
		t3.display();
		t3.Large();
		
	}

}
