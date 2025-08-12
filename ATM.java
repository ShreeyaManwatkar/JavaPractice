package com.shree;

interface ATM1{
	abstract void checkBalance();
}

class machine implements ATM1{
	public void checkBalance() {
		System.out.println("check Balance code");
}
	
class ATM{
	public static void main(String[] args) {
		machine m = new machine();
		m.checkBalance();
	 }
  }
}	
	
	// to run right click on ATM in Outline and click run as Java application
