package com.shree;

import java.util.ArrayList;
import java.util.Scanner;

public class PackagesEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int count = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter name of student " + i + ": ");
            String name = scanner.nextLine();
            students.add(name);
        }

        System.out.println("\nStudent List:");
        for (String name : students) {
            System.out.println(name);
        }

        scanner.close();
    }
}

