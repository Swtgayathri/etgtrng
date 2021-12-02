package com.sonata;

public class CountDouble 
{ 
	public static void main(String args[])
	{
		int count=0;
		int arr[]= {7,7,2,9,9,8,5,5,5};
		for(int i=0;i<arr.length;i++)
		System.out.print("\n");


		for (int a=0;a<arr.length;a++)
		{
			for (int b=a+1;b<arr.length;b++)
			{
				if ( arr[a] == arr[b] )
				{
					System.out.print(arr[b]+" ");
					count++;
				}
			}
		}
		System.out.println();
		System.out.println("Highest count of duplicates are "+count);
	}

}


	       