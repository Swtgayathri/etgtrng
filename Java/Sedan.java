package com.sonata;


public class Sedan  extends Car
{
	int length;
	Sedan(int sp,double rp,String cl,int length)
	{
		super(sp,rp,cl);
		this.length=length;
	}
	public double getSalePrice()
	{
		if(length>20)
		{
			return super.getSalePrice()-(super.getSalePrice()*0.5)	;
		}
		else
		{
			return super.getSalePrice()-(super.getSalePrice()*0.1);
		}
	}
}

