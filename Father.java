package com.shree;

public class Father {
	public void property() {
		System.out.println("3bhk");
	}
}
class Child extends Father{
	public class Single_Inheritance{
		public static void main(String[] args) {
			Child obj = new Child();
			obj.property();
		}
	}
}