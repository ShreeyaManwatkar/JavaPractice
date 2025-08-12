package com.shree;

class Print {
	 public void print() {
	     System.out.println("Print");
	 	}
	}


	class InkjetPrinter extends Print {
	 
	 public void print() {
	     System.out.println("Inkjet Printer");
	 	}
	}


	class LaserPrinter extends Print {

	 public void print() {
	     System.out.println("Laser Printer");
	 	}
	}


	public class TaskPolymorphism {
		
		public static void main(String[] args) {
	     

	     Print obj = new InkjetPrinter();   
	     obj.print();                 

	     Print obj1 = new LaserPrinter();    
	     obj1.print();     
	     
	    
		}
			
	}