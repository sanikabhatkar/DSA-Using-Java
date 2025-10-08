package com.sanika;

public class FindANumber_SortedArr {
    public static void main(String[] args) {
        int[] arr = {2, 4, 13, 20, 36, 48, 65, 79, 81, 93};
        System.out.println(bsearch(arr,4));
    }

    static int bsearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        /*
        Here (start + end)/2 -> is not applicable for large numbers therefore we have used the above formula.
         */

        while(start <= end){
            int middle = start + (end - start)/2;
            /*
            The middle formula is important
            Here, the middle formula shall come under while loop so that it calculates it iteratively.
             */

            if(target < arr[middle]){
                end = middle - 1;
            } else if (target > arr[middle]){
                start = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}

/* Total comparisons (worst case) = log N */
/*
Algorithm:
- Array must be sorted.
- Find the middle element.
- compare mid with target element if greater search right else left.
- if target == mid then return mid.
- We need binary search because the time complexity in linear search is N
 */