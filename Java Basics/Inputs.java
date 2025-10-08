package com.sanika;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); /* Creating an object called input which will consider our input*/
        System.out.println("Please Enter your Roll Number:");
        int rollno = input.nextInt();
        System.out.println("Roll no:" + rollno);

        String name = input.next(); /* Allows us to add an input */
        System.out.println(name); /* It prints it */

        float marks = input.nextFloat(); /* Same applies here */
        System.out.println(marks);
    }
}