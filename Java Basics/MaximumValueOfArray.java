package com.sanika;

import java.util.Scanner;

public class MaximumValueOfArray {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        int[] arr = {3, 4, 50, 6, 7};
        System.out.println(max(arr));
    }

    static int max(int[] arr){
        int maximum = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maximum){ // arr[0] > max : true :: update the value
                maximum = arr[i]; // true: update it's value to max
            }
        }
        return maximum;
    }
}
