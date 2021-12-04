package com.sonata;

public class Student {
	int stdID;
	String stdName;
	int stdClass;
	
	Student(int ID,String N,int C)
	{
		this.stdID=ID;
		this.stdName=N;
		this.stdClass=C;
	}
	public void display() {
		System.out.println(stdID);
		System.out.println(stdName);
		System.out.println(stdClass);
	}
	public static void main(String[]args) {
		Student std1 = new Student (246,"thanusree",4);
		std1.display();
		Student std2 = new Student(357,"Harshini",9);
		std2.display();
		
	}
	

}
