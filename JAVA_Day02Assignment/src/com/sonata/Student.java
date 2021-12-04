package com.sonata;

public class Student {

	int stdId;
	String stdName;
	int stdClass;
	
	Student() { }
	
	Student (int n,String name,int c) {
		this.stdId=n;
		this.stdName=name;
		this.stdClass=c;
	}
	
	public void display() {
		System.out.println("The Student ID is " + stdId);	
		System.out.println("The Student Name is " + stdName);	
		System.out.println("The Student is studying in " + stdClass + "th std");	
	}
	
	public static void main(String args[])
	{
	   Student s1=new Student(); //default constructor
	   s1.stdId=111;
	   s1.stdName="abc";
	   s1.stdClass=4;
	   s1.display();
	   System.out.println();
	   
	   Student s2 = new Student (222,"xyz",3); //constructor
	   
	   s2.display();
	}

}
