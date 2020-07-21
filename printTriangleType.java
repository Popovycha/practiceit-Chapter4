package com.gmail.mybmcc22;

public class Main {
 /*
 Write a method called printTriangleType that accepts three integer arguments representing the lengths
 of the sides of a triangle and prints what type of triangle it is. The three types are equilateral,
 isosceles, and scalene. An equilateral triangle has all three sides the same length,
 an isosceles triangle has two sides the same length, and a scalene triangle has three sides of different lengths.
  */
    public static void main(String[] args) {
	// Tests
        printTriangleType(6,6,6);
        printTriangleType(5,7,8);
        printTriangleType(5,6,5);
    }
    private static void printTriangleType(int a, int b, int c) {
        if (a == b && b == c){
            System.out.println("equilateral");
        } else if ( a == c ||  a == b || b == c) {
            System.out.println("isosceles");
        } else {
            System.out.println("scalene");
        }
    }
}
