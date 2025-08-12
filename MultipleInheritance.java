package com.shree;

//Interface 1
interface Printable {
 void print();
}

//Interface 2
interface Showable {
 void show();
}

//Class implementing both interfaces (multiple inheritance)
class Document implements Printable, Showable {
 public void print() {
     System.out.println("Printing document...");
 }

 public void show() {
     System.out.println("Showing document preview...");
 }
}

public class MultipleInheritance {
 public static void main(String[] args) {
     Document doc = new Document();
     doc.print();
     doc.show();
 }
}
