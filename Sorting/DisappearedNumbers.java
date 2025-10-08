package com.sanika;

import java.util.List;
import java.util.ArrayList;

public class DisappearedNumbers {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums){
        int i = 0;
        while(i < nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        List<Integer> s = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if(j != nums[j] - 1){
                s.add(j + 1);
            }
        }
        return s;
    }

    static void swap(int[] nums, int num1, int num2){
        int temp = nums[num1];
        nums[num1] = nums[num2];
        nums[num2] = temp;
    }
}