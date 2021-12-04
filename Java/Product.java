package com.sonata;

public class Product {
	int ProId;
	String ProName;
	double ProPrice;
	
	Product(int Id,String Name, double Price, int GST)
	{
		this.ProId=Id;
		this.ProName=Name;
		this.ProPrice=Price;
		double tax=GST*this.ProPrice/100;
		this.ProPrice=this.ProPrice+tax;
	}
	public void display() {
		System.out.println(ProId);
		System.out.println(ProName);
		System.out.println(ProPrice);
	}
	
	public static void main(String[] args)
	{
		int GST=11;
		Product p1 = new Product(888,"Shiva",45,GST);
		p1.display();
		Product p2 = new Product(657,"Rohan",59,GST);
		p2.display();
	}

}
