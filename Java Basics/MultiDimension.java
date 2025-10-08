package com.sanika;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        // It's okay to not mention the columns, it will directly allocate the memory based on the input.
        System.out.println("Enter the elements of the array:");
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = input.nextInt();
            }
        }

        for(int i = 0; i < arr.length; i++){
               System.out.println(Arrays.toString(arr[i]));
        }

//        int[][] arr2d = {
//                {1, 2, 3},
//                {5, 6, 7},
//                {8, 9, 10}
//        };
//        System.out.println(Arrays.deepToString(arr2d));
    }
}
