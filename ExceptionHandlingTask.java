package com.shree;

import java.util.Scanner;

public class ExceptionHandlingTask {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
				
		try {
			System.out.println("Enter 1 no");
			int num1 = scanner.nextInt();
			
			System.out.println("Enter 2 no");
			int num2 = scanner.nextInt();
			
			int result = num1/num2;
			System.out.println(result);
		}catch (Exception e){
			System.out.println("Error occured");
		}
		
		System.out.println("Program ended safely");
 
		scanner.close();
	}
}
