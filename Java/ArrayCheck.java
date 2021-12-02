package com.sonata;

public class ArrayCheck 
{
	public static void main(String args[])
	{
		String a[]={"pappy","doll","chinnu","cutie"} ;
	    String b="chinnu";
	    int i;
	    for(i=0; i<4; i++)
	    {
	    	if(a[i]==b) {
	    		System.out.println("yes,the value is present");
	    		break;
	    	}
	    }
	    if(i==4)
	    {
	    	System.out.println("no,the value is not present");
	    }
	    	
		
	}
 
}
