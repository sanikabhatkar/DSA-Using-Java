package com.sanika;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {83, 49, 50, 76, 21, 99};
        System.out.println("The number lies at index: " + search(arr,2,5, 76));
    }

    static int search(int[] arr, int start, int end, int target){

        if(arr.length == 0){
            return -1;
        }

        for (int i = start; i < end; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
