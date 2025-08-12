package com.shree;

public class ReverseArray {

	public static void main(String[] args) {
		
	int[] orignal = {10,20,30,40};
	
	System.out.println("Orignal Array:");
	for(int num : orignal) {
		System.out.println(num + " ");
	}
	System.out.println("\nReverse Array:");
	for(int i = orignal.length - 1; i >= 0; i--) {
		System.out.println(orignal[i] + " ");
		}
	}

}
