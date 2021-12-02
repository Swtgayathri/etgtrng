package com.sonata;

public class TwoLargest
{
		public static void main(String args[])
		{
			int number[]= {12,80,39,98,444,97,76};
			for(int a=0;a<number.length;a++)
			{
				System.out.print(number[a]+" ");
			}
			System.out.println("\n");
			
			int large1=number[0];
			int large2=number[1];
			int ref;
			if (large1 < large2)
			{
				ref=large1;
				large1=large2;
				large2=ref;
			}
			for (int i=2;i<number.length;i++)
			{
				if (number[i] > large1)
				{
					large2=large1;
					large1=number[i];
				}
				else if (number[i] > large2 && number[i] != large1)
				{
					large2=number[i];
				}
			}
			System.out.println("1st largest number "+large1);
			System.out.println("2rd largest number "+large2);
		}

	}

