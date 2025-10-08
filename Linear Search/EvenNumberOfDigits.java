package com.sanika;

public class EvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums = {555, 901, 482, 1771};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums){
        int count = 0;
        // iterate through every number -> for loop
        for(int i = 0; i < nums.length; i++) {
            if(counting(nums[i]) % 2 == 0){
                count++;
            }
        }
        return count;
    }

    static int counting(int num){
        int count = 0;
        while(num > 0){
            count++;
            num = num / 10;
        }
        // 1771 -> 4
        return count;
    }
}

/*
Logic:
1) Iterate through all the numbers using for loop.
2) Count the digits in a number.
3) 345/10 = 5 , 34/10 = 4 -> c(2) 3/10 = 3 (count++) - 3
4) if even, print arr[i]
 */