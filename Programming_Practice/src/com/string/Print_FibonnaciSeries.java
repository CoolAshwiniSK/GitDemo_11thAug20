package com.string;

import java.util.Arrays;

public class Print_FibonnaciSeries {

	static {
		System.out.println("Hello world!!");
	}
	
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int[] finalArray = { a , b};
		int temp[]= null;
		int sum=0;
		Arrays.copyOf(finalArray, 20);//increase size to 20
		
		
		for(int i=0; i<20; i++)
		{
			//temp[i]= finalArray[i]+ finalArray[i+1];
			//System.out.println(finalArray[i]);
			temp[i] = finalArray[i]+finalArray[i+1];
			temp[i+2] = temp[i];
		}
		
		System.out.println(temp.toString());
	}

}
