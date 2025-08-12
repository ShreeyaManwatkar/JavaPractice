package com.shree;

class AgeTooLowException extends Exception {        //Exception class
	public AgeTooLowException(String message) {
     super(message);
     }
}

public class UserDefException {
 static void validateAge(int age) throws AgeTooLowException {
     if (age < 18) {
         throw new AgeTooLowException("Age is too low! Must be 18 or above.");
     } else {
         System.out.println("Age is valid. You can proceed.");
     }
 }

 public static void main(String[] args) {
     int userAge = 16; 

     try {
         validateAge(userAge);
     } catch (AgeTooLowException e) {
         System.out.println("Caught Exception: " + e.getMessage());
     }

     System.out.println("Program ended.");
 }
}
