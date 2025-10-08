package com.sanika;

public class MissingNumber {
    static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums){
        int i = 0;
        while(i < nums.length) {
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct); // the term correct is getting converted into an index
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) { // here, the index number = the value
            if(nums[j] != j){ // if the index != number then return the index
                return j;
            }
        }
        return nums.length;
    }

    static void swap(int[] nums, int num1, int num2){
        int temp = nums[num1];
        nums[num1] = nums[num2];
        nums[num2] = temp;
    }
}
