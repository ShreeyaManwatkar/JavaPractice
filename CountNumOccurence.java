package com.shree;

import java.util.Scanner;

public class CountNumOccurence {
	public static void main(String[] args) {
		int[] arrr = {3,5,7,3,9,3,10};
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the no to count");
		int target = scanner.nextInt();
				
		int count = 0;
		for (int num : arrr) {
			if(num==target) {
				count++;
			}
		}
		System.out.println(count);
	}

}
