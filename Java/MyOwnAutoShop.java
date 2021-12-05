package com.sonata;

public class MyOwnAutoShop
{
	public static void main(String args[])
	{
		Car c = new Car(500,950000,"White");
		Sedan s = new Sedan(300,50000,"Black",20);
		Ford f1 = new Ford(200,60000,"Red",2016,8);
		Ford f2 = new Ford(400,90000,"Blue",2019,4);
		System.out.println("Car");
		c.display();
		System.out.println("Sale Price of CAR:"+c.getSalePrice());
		System.out.println("Sedan");
		s.display();
		System.out.println(s.length);
		System.out.println("Sale Price of SEDAN:"+s.getSalePrice());
		System.out.println("Ford One");
		f1.display();
		System.out.println(f1.year);
		System.out.println(f1.manufacturerDiscount);
		System.out.println("Sale Price of FORD ONE:"+f1.getSalePrice());
		System.out.println("Ford Two");
		f2.display();
		System.out.println(f2.year);
		System.out.println(f2.manufacturerDiscount);
		System.out.println("Sale Price of FORD TWO:"+f2.getSalePrice());
	}
}
