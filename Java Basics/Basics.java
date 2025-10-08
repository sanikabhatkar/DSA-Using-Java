package com.sanika;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        if (number == 10) {
            System.out.println("Hello");
        }

        /* While Loop */
        int count = 1;
        while (count != 5) {
            System.out.println(count);
            count++;
        }

        /* For Loop */
        for(int count1 = 1; count1 !=5; count1++) {
            System.out.println(count1);
        }
    }
}