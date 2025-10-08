package com.sanika;

import java.util.Arrays;
import java.util.Scanner;

public class SwapArrays {
    public static void main() {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the array elements:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        swap(arr,0,1);
    }
    static void swap(int[] arr, int index0,  int index1) {
        int temp = arr[index0];
        arr[index0] = arr[index1];
        arr[index1] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
