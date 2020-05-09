package com.gmail.mybmcc22;

/*
 * Write a method named smallestLargest that asks the user to enter numbers,
 * then prints the smallest and largest of all the numbers typed in by the user.
 * You may assume the user enters a valid number greater than 0 for the number of numbers to read.
 */

import java.util.Scanner;

public class smallestLargest {

    public static void main(String[] args) {
    smallestLargest();
    }
    public static void smallestLargest(){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter? ");
        int number = sc.nextInt();
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i = 1; i <= number; i++){
            System.out.print("Number "+ i + ": ");
            int num = sc.nextInt();
            if (num < smallest){
                smallest = num;
            }
            if (num > largest){
                largest = num;
            }
        }
        System.out.println("Smallest = " + smallest);
        System.out.println("Largest = " + largest);
    }

}
