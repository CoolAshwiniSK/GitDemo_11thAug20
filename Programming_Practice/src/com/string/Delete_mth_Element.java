package com.string;

import java.util.*;

public class Delete_mth_Element {

	static Scanner scan;
	static String str= "Ashwini";
	static int n;
	
	
	public static String delete(String s, int n)
	{
		int len= s.length();
		String after_remove_str =s.substring(0, n-1)+s.substring(n, len);
		return after_remove_str;
	}
	
	
	
	public static void main(String args[]) {
		
	scan= new Scanner(System.in);
	//System.out.println("Enter string: ");
	//str= scan.nextLine(); 
	System.out.println("Enter nth element to delete: ");
	n = scan.nextInt();
		
	String final_String= delete(str, n);
	System.out.println(final_String);
	}
	
}
