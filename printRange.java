package com.gmail.mybmcc22;

/**
 * Write a method called printRange that accepts two integers as arguments and
 * prints the sequence of numbers between the two arguments, separated by spaces.
 * Print an increasing sequence if the first argument is smaller than the second;
 * otherwise, print a decreasing sequence.
 * If the two numbers are the same, that number should be printed by itself.
 * Here are some sample calls to printRange:
 */
class Main {

    public static void main(String[] args) {
	    printRange(2,7);
        printRange(19,11);
        printRange(5,5);
    }
    public static void printRange(int num1, int num2){
        if( num1 <= num2) {
            for(int i = num1; i <= num2; i++){
                System.out.print( i + " ");
            }
        }else{
            for(int i = num1; i >= num2; i--){
                System.out.print(i +  " ");
            }
        }
        System.out.println();
    }
}
