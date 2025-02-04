package com.core.oops.inheritance;

public class PolyMorphismExample {
    public static void main(String[] args) {
        Calculation calc = new Calculation();
        // Compile-time polymorphism: selecting the appropriate add method based on parameter types
        System.out.println("Sum of integers: " + calc.add(5, 3));
        System.out.println("Sum of doubles: " + calc.add(2.5, 3.7));
    }
}
