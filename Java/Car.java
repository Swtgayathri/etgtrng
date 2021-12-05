package com.sonata;

public class Car 
{
int speed;
double regularPrice;
String color;

Car(int sp ,double rp,String cl)
{
	this.speed = sp;
	this.regularPrice=rp;
	this.color=cl;
}

public double getSalePrice()
{
	return regularPrice;
}
public void display()
{
	System.out.println(speed);
	System.out.println(regularPrice);
	System.out.println(color);
	
}

}