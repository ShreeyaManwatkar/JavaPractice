package com.shree;

public class OddCounter {

	public static void main(String[] args) {
		int[] numbers = {12,7,3,8,15,24,17};
		int count=0;
		
		for(int num: numbers) {
			if (num % 2 != 0) {
				count++;
			}
        }
		System.out.println("Number of odd elements: " + count);
		
	}
	
}


