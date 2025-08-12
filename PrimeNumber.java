package com.shree;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner Sc = new Scanner (System.in);
		System.out.println("Enter a number");
		int number = Sc .nextInt();
		
		if(isPrime(number)) {
			System.out.println(number+"is a prime a number.");
		}else { 
			System.out.println(number+"is not a prime a number.");
		}
	}
	private static boolean isPrime(int number) { 
		for(int i=2; i <= number/2; i++) {
			if(number%i==0) {
			}
			return false;
		}
		return true;
    }
	
}
