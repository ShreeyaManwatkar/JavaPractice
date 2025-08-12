package com.shree;
import java.util.Vector;

public class StringBuffer_Vector {
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" Java");
        sb.insert(5, " World");
        System.out.println("StringBuffer Result: " + sb);

        
        Vector<String> fruits = new Vector<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("Vector Elements: " + fruits);

        fruits.remove("Banana");
        fruits.add("Orange");
        System.out.println("Updated Vector: " + fruits);
    }
}
