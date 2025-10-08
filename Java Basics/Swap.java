package com.sanika;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Swap();
    }

     public static void Swap(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = input.nextInt();

         /* Logic */
         int temp = num1;
         num1 = num2;
         num2 = temp;

         System.out.println(num1 + " " + num2);
    }
}
