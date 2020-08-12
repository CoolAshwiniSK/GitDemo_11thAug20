package com.string;

	
	public class Find_TwoMax_Array {
		public void GetTwoMaxValues(int[] nums) {

			int maxOne = 0;
			int maxTwo = 0;
			for (int n : nums) {
				if (maxOne < n) {
					maxTwo = maxOne;
					maxOne = n;
				} else if (maxTwo < n) {
					maxTwo = n;
				}

			}

			System.out.println("Max1 - " + maxOne);
			System.out.println("Max2 - " + maxTwo);
		}

		public static void main(String[] args) {

			int list[] = { 15, 24, 79, 93 };

			Find_TwoMax_Array max = new Find_TwoMax_Array();
			max.GetTwoMaxValues(list);
		}
	}
	
