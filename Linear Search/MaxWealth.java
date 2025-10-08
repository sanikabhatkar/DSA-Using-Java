package com.sanika;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {2, 8, 7},
                {7, 1, 3},
                {1, 9, 5}
        };
        System.out.println(add(accounts));
    }

    static int add(int[][] accounts){
        int sum = 0;
        int max = 0;
        for (int i = 0; i < accounts.length ; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }
            if(sum > max){
                max = sum;
            }
            sum = 0;
        }
        return max;
    }
}

/*
Logic:
1) Occurance using for loop
2) Obtain the sum of each element in the array
 */