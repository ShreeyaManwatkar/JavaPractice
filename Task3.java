package com.shree;

public class Task3 {
	
	public Task3() {
		System.out.println("No values provided");
	}
	
	public Task3(int value) {
		System.out.println("Value" + value);
	}
	
	public Task3(int value1, int value2) {
		int sum = value1 + value2;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Task3 obj1 = new Task3();
		Task3 obj2 = new Task3(5);
		Task3 obj3 = new Task3(1,2);

	}

}
