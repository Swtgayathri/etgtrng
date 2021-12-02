package com.sonata;

public class DublicNumber
{
	public static void main(String args[])
	{
		int[] array = { 12,34,45,56,34,12};
		int i,j;
		for(i=0;i<array.length;i++)
			for(j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
					System.out.println(array[j]);
			}
				
	}

}
