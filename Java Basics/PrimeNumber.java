package com.sanika;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); // n = 7
        boolean answer = isArmStrong(153);
        boolean ans = isPrime(n);
        System.out.println("Is it Prime?: " + ans);
        System.out.println("Is it Armstrong?: " + answer);
    }

    static boolean isPrime(int n) {
        if (n <= 1){
            return false;
        }
        int c = 2; //count, 3
        while(c * c <= n) { // 4 < 7 [not run while for 7]
            if(n % c == 0){ // 7 % 4 != 0
                return false;
            }
            c++;
        }
        return c * c > n; // 3 * 3 = 9 > 7
    }

    // Print all 3 digit armstrong numbers.
    static boolean isArmStrong(int n){
        int original = n; // example: n = 153
        int sum = 0;

        while(n > 0){
            int rem = n % 10; // this will give us 3 // 5 // 7
            sum = sum + rem*rem*rem; // 0 + 27 // 27 + 125 // 27 + 125 + 49
            n = n / 10; // get rid of 3 // get rid of 5 // get rid of 7
        }
        return sum == original;
    }
}