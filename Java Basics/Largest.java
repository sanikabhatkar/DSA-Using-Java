package com.sanika;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        /* Method 1 */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number 1:");
        int num1 = input.nextInt();
        System.out.println("Enter Number 2:");
        int num2 = input.nextInt();
        System.out.println("Enter Number 3:");
        int num3 = input.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("Largest Number: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Largest Number: " + num2);
        } else {
            System.out.println("Largest Number: " + num3);
        }

        /* Method 2: Easy Method*/
        int a = 10;
        int b = 20;
        int c = 30;

        int max = a; // a = 10 = max

        if (b > max) {
            max = b; // here, b > max, max = 20
        }

        if (c > max){ // here, c > max, max = 30
            max = c;
        }

        System.out.println("Largest Number: " + max);
    }
}
