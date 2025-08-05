package com.shree;

public class ArraySum {

	public static void main(String[] args) {
		int[] numbers = {5, 12, 7, 3, 9}; 
		 int sum = 0;
		 
		 for (int num: numbers) {
			 sum += num; 
		 }
		 
		 System.out.println("Sum of all elements:"+ sum);
		
	}
}