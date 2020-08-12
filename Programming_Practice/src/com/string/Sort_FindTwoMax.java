package com.string;

public class Sort_FindTwoMax {

	static int my_array[]= {20, 10, 5, 90, 5, 21};
	static int len;
	static int temp=0;
	
	private static void sort(int m[]) {
		
		for(int i=0; i<len-1; i++)
		{
			for(int j=0; j<len-1-i;j++)
			{
				if(m[j] > m[j+1])
				{
					temp= m[j];
					m[j] = m[j+1];
					m[j+1]= temp;
				}	
				
			}
			
		}
		System.out.println("sorted array:");
		for(int i=0; i<len; i++)
		{
		System.out.println(m[i]+", ");
		}
		
		System.out.println("1st max= "+m[len-1]);
		System.out.println("2nd max= "+m[len-2]);
	}
	
	
	
	public static void main(String[] args) {

		
		len= my_array.length;
		
		System.out.println("length: "+len);
		System.out.println("Original array: ");
		
		for(int i=0; i<len; i++)
		{
		System.out.print(my_array[i]+", ");
		}
		
		 sort(my_array);
	}

	

}
