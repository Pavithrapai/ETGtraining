package com.sonata;

public class GreatestNumber {
	public static void main(String args[])
	{
		int a=12,b=25,c=89;
		if(a>=b && a>=c)
		{
			System.out.print("The Greatest Number is " +a);	
		}
		else if(b>=a && b>=c)
		{
			System.out.print("The Greatest Number is " +b);	
		}
		else
		{
			System.out.print("The Greatest Number is " +c);	
		}
	}
}
