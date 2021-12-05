package com.sonata;

public class Ford extends Car {
	
	int year;
	int manufacturerDiscount;
	Ford(int sp,double rp,String cl,int yr,int mfD)
	{
		super(sp,rp,cl);
		this.year=yr;
		this.manufacturerDiscount = mfD;
	}
	public double getSalePrice()
	{

		return super.getSalePrice()-manufacturerDiscount;

}
}