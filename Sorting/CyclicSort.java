package com.sanika;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 1, 2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct); // the term correct is getting converted into an index
            } else {
                i++; // move ahead
            }
        }
    }

    static int swap(int[] arr, int num1, int num2){
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
        return temp;
    }
}

/*
Cyclic Sort Theory
1) VIP: When given numbers from range 1 to N, use cyclic sort.
2) Use this when a range is mentioned
3) Index = Value - 1 // Super Important
For Example: 1, 2, 3, 4, 5, here the index values are from 0 to 4.
4) In worst case we will make N-1 Swaps and 5 comparisons
   (N-1) + N = (2N-1) = N
   Worst case complexity is O(N)
*/