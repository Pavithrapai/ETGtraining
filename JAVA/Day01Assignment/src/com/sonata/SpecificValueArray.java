package com.sonata;

public class SpecificValueArray {
	public static void main(String args[])
	{
		int arr[] = {10,20,30,40,50};
		int n=40;
		for(int i=0;i<arr.length;i++)
		{
			if(n==arr[i])
			{
				System.out.println("Array contains the given element");
				
			}
		}
	}
}
