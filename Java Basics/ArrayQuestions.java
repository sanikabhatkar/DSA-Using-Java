package com.sanika;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayQuestions {
    public static void main(String[] args) {
        /* Array is a collection of datatype. */
        /* Syntax: datatype[] variable name = new datatype[size]; */
        Scanner input = new Scanner(System.in);

        /* Example */
        int[] rollno = new int[10]; // Method 1
        int[] rollno1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Method 2: every number is an object stored in different memory.
        /* rollno & rollno1 = reference variable. Happens at compile time. */
        /* rhs (numbers in an array) = objects. Happens at run time. (dynamic memory allocation -> memory is allocated at the run time.) */

        /* Declaration of Array */
        int[] fun;

        /* Object Creation in the Heat Memory */
        fun = new int[5]; /* new: used to create an object , by default internally the value is {0, 0, 0, 0, 0} */

        /* Primitives are stored in the stack memory */
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 233;
        arr[2] = 760;
        arr[3] = 3;
        arr[4] = 45;
        System.out.println(arr[2]);

        /* Array Inputs using Loops */
        for(int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        /* Array Output using Loops */
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        String[] str = new String[5];
        for(int i = 0; i < str.length; i++){
            str[i] = input.next();
        }

        System.out.println(Arrays.toString(str));
    }
}
