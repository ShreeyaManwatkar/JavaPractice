package com.shree;


class Printer {
    void print() {
        System.out.println("Printing from generic printer...");
    }
}

class InkjetPrinter extends Printer {
    @Override
    void print() {
        System.out.println("Printing using Inkjet Printer...");
    }
}

class LaserPrinter extends Printer {
    void print() {
        System.out.println("Printing using Laser Printer...");
    }
}


public class PrinterTest {
    public static void main(String[] args) {
       
        Printer p1 = new InkjetPrinter();
        Printer p2 = new LaserPrinter();

        p1.print();
        p2.print();
    }
}
