package com.shree;

public class MaxValue {

	public static void main(String[] args) {
		int[] nums = {4, 17, 9, 23, 11};
		int max = nums [0];
		
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > max)
				max = nums [i];
		}
		
		System.out.println("Largest number: " + max);
	}

}
