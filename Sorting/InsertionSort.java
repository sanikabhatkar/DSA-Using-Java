package com.sanika;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {56, 3, 87, 22, 39, 15, 40};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if(arr[j] < arr[j - 1]){
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

/*
Insertion Sort Algorithm
1) Sort it in sections.
2) For every index that you are at, put the index element at the correct index of the LHS.
3) When i = 0 , j = 1
4) When element j !< than previous element, then break, because LHS is already sorted.
5) Time Complexity : O(N^2)
6) Best Case : Array is already sorted. -> complexity is O(N).
7) Number of swaps are reduced as compared to bubble sort.
8) It is stable.
9) Used for Smaller values of N, works good for partially sorted arrays.
 */
