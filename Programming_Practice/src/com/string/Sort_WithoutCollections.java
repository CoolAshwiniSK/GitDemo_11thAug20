package com.string;

import java.util.*;
import java.util.List;

public class Sort_WithoutCollections {

	
	public static void main(String[] args)
	{
		List<String> mylist = new ArrayList<String>();
		
		String[] array= {"Ash", "Jack", "123", "Cat"};
		String temp= null;
		//System.out.println(array[0]);
		//System.out.println(array[1]);
		System.out.println(array.length);
		
		int length = array.length;
		
		/*for(int i=0;i<array.length-1;i++)
		{
			for (int j=i+1; j<array.length;j++)
			
			if(array[i].compareTo(array[j])>0)
			{
				temp=array[i];
				array[i]=array[j];
				array[j]= temp;
			}
		
		}	
	
		System.out.println(Arrays.toString(array));*/
		
		
		for(int i=0; i<length-1;i++) 
		{
			if(array[i].compareTo(array[i+1])>0)
			{
				temp=array[i];
				array[i]=array[i+1];
				array[i+1]= temp;
			}
		}
		
		System.out.println(Arrays.toString(array));
		
		
		
		
		
		
		
		
		
	
}
}