package com.sanika;

import java.util.Arrays;

public class SearchIn2DArray {
    static void main(String[] args) {
        int[][] arr = {
                {98, 5, 3},
                {7, 10, 11},
                {17, 37, 42}
        };
        System.out.println("The target value is at index: " + Arrays.toString(search(arr,37)));
        System.out.println("Maximum Number: " + maximum(arr));
        System.out.println("Minimum Number: " + minimum(arr));
    }

    static int[] search(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length ; j++){
                if(target == arr[i][j]) {
                    return new int[]{i,j}; // here, to return the indices, we return it in the form of an array.
                }
            }
        }
        return new int[]{-1, -1}; // same is applied over here.
    }

    /* Function for Maximum Number in 2D Array */

    static int maximum(int[][] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    /* Function for Minimum Number in 2D Array */

    static int minimum(int[][] arr){
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] < min){
                    min = arr[i][j];
                }
            }
        }
        return min;
    }
}
