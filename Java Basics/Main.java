package com.sanika;
// The class name should always start with Capital Letter: Good Practice
// The class should contain the file name.

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Hello World!");
        /* Only writing print will ensure that the content ahead will not be added to the new line. */
        System.out.println("I'm Sanika");
        Scanner kush = new Scanner(System.in);
        System.out.println(kush.nextLine());
    }
}

/*
1) class: group of properties & functions.
2) main: the function name has to be main.
3) static: it is mentioned because we need to run it without creating any object.
4) void : return type (don't give me any return type)
5) System is a class which contains a variable called "out" and this variable has a method called "println" will take a string and output it.
6) Package : The folder in which your java file lies. Example: "com.sanika"
7) Scanner : It should be able to take input from us. It is a class which allows us to take input. (System.in): The input is considered from the keyboard.
8) public : It can be accessed from anywhere.
*/
