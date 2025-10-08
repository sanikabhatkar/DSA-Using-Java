package com.sanika;

import java.util.Arrays;

public class ChangeValue {
    static void main(String[] args) {
        int[] arr = {1, 3, 2, 45, 6};
        int[] arr1 = change1(arr);
        change(arr);
        System.out.println(Arrays.toString(arr1));
    }

    static void change(int[] nums){
        nums[0] = 99; // here we are not creating an object, but modifying the existing object.
    }

    static int[] change1(int[] ignoredNums){
        int[] nums = {9, 10, 5, 4, 8};
        return nums;
    }
}

/*
Logic of the Code:
- here, arr = {1, 3, 2, 45, 6}
- here, nums(array name) -> yet again pointing to the same array.
- nums[0] = 99, change the value, it will also change for arr.
*/