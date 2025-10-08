package com.sanika;

public class MinimumNumber {
    static void main(String[] args) {
        int[] arr = {83, 49, 50, 76, 21, 99};
        System.out.println("The minimum number: " + minimum(arr));
    }

    static int minimum(int[] arr){
        int min = arr[0]; // to ensure that the minimum is the first number from the array.
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}