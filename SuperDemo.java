package com.shree;

class parent0{
		void car() {
			System.out.println("BMW");
		}
	}
 
	class Son extends parent0{
		void car() {
			super.car();
			System.out.println("Wagonr");
		}
	}

public class SuperDemo {
	public static void main(String[] args) {
		Son obj = new Son();
		obj.car();
	}

}


