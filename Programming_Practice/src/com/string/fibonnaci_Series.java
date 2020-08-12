package com.string;

public class fibonnaci_Series {

	public static void main(String[] args) {
		
		int a = 0, b=1;
		
		int sum=0;
		System.out.println("***Fibonnaci series***");
		System.out.print(a+","+b+",");
		
		for(int i=1; i<15; i++)
		{
			sum = a + b;
			System.out.print(sum+",");
			a = b;
			b = sum;
			
		}
	}
}
