package com.shree;
public class Overloading{

    Overloading() {
        System.out.println("Default Constructor");             // Constructor Overloading
    }

    Overloading(String name) {
        System.out.println("Hello " + name);
    }

    void display() {                                          // Method Overloading
        System.out.println("Display without parameters");
    }

    void display(String msg) {
        System.out.println("Display with message: " + msg);
    }

    public static void main(String[] args) {
        Overloading obj1 = new Overloading();
        Overloading obj2 = new Overloading("Shreeya");

        obj1.display();
        obj1.display("Welcome!");
        obj2.display();
    }
}
