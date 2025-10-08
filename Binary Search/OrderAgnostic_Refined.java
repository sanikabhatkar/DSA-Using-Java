package com.sanika;

public class OrderAgnostic_Refined {
    static void main(String[] args) {
        int[] arr = {1, 4, 7, 13, 26, 39, 44, 52, 67};
        System.out.println(bsearch(arr,13));
    }

    static int bsearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean asc = arr[start] < arr[end];

        while(start <= end){
            int middle = start + (end - start)/2;
            if(target == arr[middle]){
                return middle;
            }
            if(asc) {
                if (target > arr[middle]) {
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }
            } else {
                    if(target < arr[middle]){
                        start = middle + 1;
                    } else {
                        end = middle - 1;
                    }
            }
        }
        return -1;
    }
}
