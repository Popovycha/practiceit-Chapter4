package com.gmail.mybmcc22;
/**
*Write a method named evenSum that prompts the user for many integers
*and print the total even sum and maximum of the even numbers.
*You may assume that the user types at least one non-negative even integer.
 */
import java.util.Scanner;

public class evenSum {

    public static void main(String[] args) {
	evenSum();
    }
    public static void evenSum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("how many integers? ");
        int number = sc.nextInt();
        int even = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < number; i++) {
            System.out.print("next integer? ");
            int num = sc.nextInt();
            if( num % 2 == 0){
                even += num;
                if( num > max)
                    max = num;
            }
        }
        System.out.println("even sum = " + even);
        System.out.println("even max = " + max);
    }
}
