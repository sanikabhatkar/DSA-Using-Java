package com.sanika;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /* Q: Print Numbers from 1 to 5 : While Loop (when we do not know how many times the loop will run) */
        int i = 1;
        while(i != 6){
            System.out.println(i);
            i++;
        }

        /* For Loop: When we know how many times the loop will run */
        for(int a = 1; a < 6; a++){
            System.out.println(a);
        }

        /* Q: Print numbers from 1 to n : While Loop : It will only run the code if the condition is satisfied */
        Scanner input = new Scanner(System.in);
        int b = 1;
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        while(b <= number){
            System.out.println(b);
            b++;
        }

        /* Do While Loop : It will always run your code once */
        int c = 1;
        do {
            System.out.println(c); // print(1), c = 2, print(2), c = 3, print(3), c = 4, print(4), c = 5, print(5)
            c++; // c = 6 (loop stops working)
        } while (c <= 5);
    }
}