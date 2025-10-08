package com.sanika;

public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 9, 11, 17, 23, 39};
        int ans = bsearch(arr, 15);
        System.out.println(ans);
    }

    static int bsearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int middle = start + (end - start)/2;

            if(target < arr[middle]){
                end = middle - 1;
            } else if(target > arr[middle]){
                start = middle + 1;
            } else {
                return middle;
            }
        }
        return arr[start]; // for floor, we need to return the end element.
    }
}

/*
Concept:
1) For a given array, if sorted array, apply binary search, here, example target = 15
2) Ceiling = Smallest Element in an array, i.e. greater than or = to target. If 16 is mentioned then it is the ceiling for the target.
3) The number closest to the target but greater than the target.
4) Logic: Keep continuing the loop, till the start = middle = end, once the target != middle, the while loop gets violated & we would return the start element because end = start + 1
5) Floor -> exact opposite of the ceiling
 */