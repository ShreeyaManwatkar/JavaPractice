package com.shree;

public class Robot {
	public void hello() {
		System.out.println("Hello, How are you?");
	} 
	public static void main(String[] args) {
		Robot obj = new Robot();
		obj.hello();
		obj.hello();
	}
}