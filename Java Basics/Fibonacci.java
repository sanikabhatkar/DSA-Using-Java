package com.sanika;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int number = input.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;

        for(int i = 0; i <= number; i++){
            c = a + b;
            System.out.println(a);
            a = b;
            b = c;
        }
    }
}
