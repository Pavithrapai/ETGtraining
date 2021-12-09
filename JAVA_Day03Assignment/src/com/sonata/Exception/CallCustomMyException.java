package com.sonata.Exception;


public class CallCustomMyException {
	public static void main(String args[]) throws MyException {
		double empSal = 50000;
		if(empSal < 100000) {
			throw new MyException("Sorry, your salary does not match the min criteria of 1 lakh");
		}
		else {
			System.out.println("Congratulations!!");
		}
	}

}
