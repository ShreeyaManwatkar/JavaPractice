package com.shree;

class Person1{
	String name;
	int age;

	public void displayDetails() {
		System.out.println("Name" +" "+ name);
		System.out.println("Age" +" "+ age);
	}
}

class Student extends Person1{
	String studentID;
	
	public void displayStudentInfo() {
		
		displayDetails();
		System.out.println("Student ID" + studentID);
	}
}

public class Person {
	
	public static void main(String[] args) {
		Student obj = new Student();
		obj.name = "Alice";
		obj.age = 25;
		obj.studentID ="DY123";
		obj.displayStudentInfo();
	} 

}