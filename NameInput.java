package com.shree;
import java.util.Scanner;

public class NameInput {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your name");
		
		String name = obj.nextLine();
		System.out.println("Enter your phone number");
		long ph = obj.nextLong();
		
		System.out.println("Your name is " + name);
		System.out.println("Your phone number is " + ph);
		obj.close();
	}
}
