package com.sanika;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = input.nextInt(); // get an input
        int ans = 0; //initialise ans as 0
        while(n > 0){
            int remainder = n % 10; //modulo 10 will give the last digit
            ans = ans * 10 + remainder; //make sure to multiply previous digit with 10 & then add the remainder to get it in reverse order.
            n = n / 10; // divide by 10 to get rid of the previous number
        }
        System.out.println(ans);
    }
}
