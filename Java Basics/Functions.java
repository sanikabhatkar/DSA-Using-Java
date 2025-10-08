package com.sanika;

import java.util.Scanner;

/* In Java, Functions are also called as "Methods" */
public class Functions {
    /* Method 1 : Addition of 2 Numbers */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        Addition(); //Function Calling
//        int ans = Add();
//        System.out.println(ans);
//        int ans = Sumation(20, 30);
//        System.out.println(ans);
        String personalised = myGreet("Sanika Bhatkar");
        System.out.println(personalised);
    }

// Creating a Function called "Addition"
    static void Addition() {
        /* Here void means no return type */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();
        System.out.print("Enter another number: ");
        int b = input.nextInt();
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    /* Return the Value */
    static int Add(){
        /* Here "int" means return type should be string */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();
        System.out.print("Enter another number: ");
        int b = input.nextInt();
        int sum = a + b;
        return sum; // here, the function end and only Returns the value.
    }

    /* Arguments: Pass the value of numbers while calling the function */
    static int Sumation(int a, int b){
        int sum = a + b;
        return sum;
    }

    static String myGreet(String name){
        String message = "Hello " + name;
        return message;
    }
}

/* For Scanner, mention it in individually in every function and  mention in the main function as well */