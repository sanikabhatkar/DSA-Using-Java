package com.sanika;

import java.util.Scanner;

public class Sum {
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = input.nextInt();
        System.out.println("Enter the second number:");
        int b = input.nextInt();
        int c;
        c = a + b;
        System.out.println("Addition:" + c);
    }
}
