package com.sanika;

import java.util.Arrays;

public class SelectionSort {
    static void main(String[] args) {
        int[] arr = {5, 77, 62, 190, 83, 1};
        select(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void select(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = maximum(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int maximum(int[] arr,int start, int end){
        int max = start;
        for (int i = start ; i <= end; i++) {
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
}

/*
Selection Sort Algorithm
1) It selects the element and adds it to it's correct place.
2) Select the largest element and add it to the last position, and carry it out for the rest of the array elements.
3) Or one, can also select the minimum element and swap with the element on the first position.
4) Worst Case: O(N^2), Best Case: O(N^2) // because it is finding maximum value for each iteration.
5) Use Case: Performs well on small lists.
6) It is not stable.
 */