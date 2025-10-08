package com.sanika;

public class DuplicateNumber {
    static void main(String[] args) {
        int[] nums = {3, 3, 3, 3, 3};
        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums){
        int i = 0;
        while(i < nums.length) {
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if(j != nums[j]){
                return nums[j];
            }
        }
        return nums.length;
    }

    public static int findDuplicate2(int[] nums){
        int index = 0;
        while(index < nums.length) {
            if(nums[index] != index + 1){
                int correct1 = nums[index] - 1;
                if(nums[index] != nums[correct1]) {
                    swap(nums, index, correct1);
                } else {
                    return nums[index];
                }
            } else {
                index++;
            }
        }
        return -1;
    }

    static void swap(int[] nums, int num1, int num2){
        int temp = nums[num1];
        nums[num1] = nums[num2];
        nums[num2] = temp;
    }
}
