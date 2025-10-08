package com.sanika;

import java.util.Scanner;

public class CountOccurance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* Occurance of the Number 3 */
        System.out.println("Enter a Number:"); // add a random number
        int n = input.nextInt();
        int count = 0;
        while (n > 0) {
            int remainder = n % 10; // modulus with 10 gives remainder as the last digit
            if (remainder == 3){ // if it is equal to the number required then count = 1 and so on!
                count++;
            }
            n = n / 10; // here divide by 10 to discard the last number
        }
        System.out.println("The Number 3 occurs: " + count + " times");
    }
}
