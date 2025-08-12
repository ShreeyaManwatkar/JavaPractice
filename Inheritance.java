package com.shree;

class Animal0 {                                            //Single Inheritance
 void eat() {
     System.out.println("This animal eats food.");
 }
}
class Dog extends Animal0 {
 void bark() {
     System.out.println("Dog barks.");
 }
}
class Puppy extends Dog {                                //Multilevel Inheritance
 void weep() {
     System.out.println("Puppy weeps.");
 }
}
class Cat00 extends Animal0 {                               //Hierarchical Inheritance
 void meow() {
     System.out.println("Cat meows.");
 }
}

public class Inheritance{
 public static void main(String[] args) {
     Dog dog = new Dog();                   // Single Inheritance
     dog.eat();
     dog.bark();

     Puppy puppy = new Puppy();             // Multilevel Inheritance
     puppy.eat();
     puppy.bark();
     puppy.weep();

     Cat00 cat = new Cat00();                   // Hierarchical Inheritance
     cat.eat();
     cat.meow();
 }
}
