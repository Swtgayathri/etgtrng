package com.sonata;

public class Truck extends Car
{
	int weight;
	Truck(int sp,double rp,String cl,int weight)
	{
		super(sp,rp,cl);
		this.weight=weight;
	}
	public double getSalePrice()
	{
		super.getSalePrice();
		if(weight>2000)
		{
			return this.getSalePrice()-(this.getSalePrice()*0.1);
		}
		else
		{
			return this.getSalePrice()-(this.getSalePrice()*0.2);
		}
	}

}


