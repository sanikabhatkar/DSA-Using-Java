package com.sanika;

import java.util.Arrays;

public class ColNoFixed {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6},
                {7, 8, 9}
        };

        for(int i = 0; i < arr.length; i++){
             // here we have used arr[row].length, the columns will be created based on the length of the row in every iteration.
//                System.out.print(arr[i][j] + " ")
            System.out.println(Arrays.toString(arr[i]));
            }
//
        }
    }