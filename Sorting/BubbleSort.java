package com.sanika;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7, 42, 8600, 5203, 1, 25, 69};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){
        boolean swap;
        for (int i = 0; i < arr.length; i++) {
            swap = false;
            for (int j = 1; j < arr.length - i; j++) { // till length - i (because for the first pass the largest element is at the end)
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swap = true; // if swap is taking place it is true.
                }
            }
            // if you did not swap for a particular value of i, means array is sorted, then stop the program
            if(!swap){ // or else (swapped == false)
                break;
            }
        }
    }
}

/*
Bubble Sort Algorithm : Theory
1) Compare the adjacent elements i.e. i and the i+1 element.
2) With the first pass, we obtain the largest element at the end position. This occurs for every step.
3) It is also known as "Sinking Sort" or "Exchange Sort"
4) i = counter (which iterates for 'n - 1')
5) j = internal loop (arr.length - i)
6) Space Complexity : O(1) // Constant -> No extra space is required aka "In Place Sorting Algorithms"
7) Time Complexity : Best Case : O(N) [Sorted Array] & Worst case : O(N^2) [Sorted Array in Opposite], where N is the number of comparisons. As the size of array (>) the comparisons (>)
8) In Time Complexity, the constants are ignored.
 */