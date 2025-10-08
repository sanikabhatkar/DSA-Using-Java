package com.sanika;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {23, 65, 76, 34, 89, 94};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int index0,  int index1) {
        int temp = arr[index0];
        arr[index0] = arr[index1];
        arr[index1] = temp;
//        System.out.println(Arrays.toString(arr));
    }
}
