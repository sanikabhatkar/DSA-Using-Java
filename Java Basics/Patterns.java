package com.sanika;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*"); //print the stars
            }
            System.out.println(" ");
        }
        System.out.println();

        for(int i = 1; i <= n; i++){ // rows (always start with 1)
            for(int j = 1; j < n - i; j++){ // add the spaces
                System.out.print(" ");
            }
            for(int k = 0; k < i; k++){ //
                System.out.println("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
