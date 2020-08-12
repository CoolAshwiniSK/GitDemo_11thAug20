package com.string;

public class Reverse_Number {

	public long doInvert(long number) {

		/*long invert = 0;
		while (number != 0) {
			invert = (invert * 10) + (number % 10);
			number = number / 10;
		}*/
		
		long reverse =0;
		do
		{
			reverse = (reverse*10) + (number%10);
			number = number / 10;
		} while(number!=0);
		
		return reverse;
	}

	public static void main(String args[]) {
		long lnum = 7895;
		Reverse_Number input = new Reverse_Number();

		System.out.println("Input value : " + lnum);
		System.out.println("Inverted value : " + input.doInvert(lnum));
	}
}