package com.shree;

class Calculator{
	Calculator (int a,int b) {
		int sum = a+b;
		System.out.println("Addition" + sum);
	}
	
	Calculator(int a, int b,boolean multiply){
		int multiplication = a*b;
		System.out.println("Multiplication " + multiplication);
		
	}
	Calculator(double a, double b){
		double substraction = a-b;
		System.out.println("Substraction " + substraction);
	}
}
public class MainCalculator {
	public static void main(String[] args) {
		new Calculator(23, 34);
		Calculator obj2 = new Calculator(23, 34, true);
		Calculator obj3 = new Calculator(45.5, 28.6);
	}
}