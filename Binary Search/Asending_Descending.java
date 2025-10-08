package com.sanika;

public class Asending_Descending {
    static void main(String[] args) {
        int[] arr = {2, 5, 34, 87};
        int[] brr = {98, 65, 43, 7};
        find(arr);
        find(brr);
    }

    static void find(int[] arr){
        int start = arr[0];
        int finish = arr.length;
        if(start < finish){
            System.out.println("Ascending");
        } else {
            System.out.println("Descending");
        }
    }
}
