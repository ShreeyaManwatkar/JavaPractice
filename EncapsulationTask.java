package com.shree;

 class Employee {
	 private String name;
	 private int id;
	 private double salary;
 
	 public String getName() {
		 return name;
	 }
	 
	 public void setName(String name) {
		 this.name=name;
	 }
	 
	 public int getId() {
		 return id;
	 }
	 
	 public void setId(int id) {
		 this.id=id;
	 }
	 
	 public double getSalary() {
		 return salary;
	 }
	 
	 public void setSalary(double salary) {
		 this.salary=salary;
	 }
 }

public class EncapsulationTask {

	public static void main(String[] args) {
		Employee emp = new Employee();
		
		emp.setName("Eve");
		emp.setId(101);
		emp.setSalary(50000);
		
		System.out.println(emp.getName());
		System.out.println(emp.getId());
		System.out.println(emp.getSalary());
		
	}

}
