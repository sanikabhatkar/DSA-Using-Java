package com.sanika;

public class FindANumber {
    public static void main(String[] args) {

        // Initialize an array
        int[] arr = {18, 5, 39, 69, 22, 87};
        System.out.println("Does the number exist?: " + search(arr, 87));
        System.out.println("The number exists at Index Number: " + search2(arr, 69));

        /* Find a particular element in an array : Example 69: Method 1 */
//        for(int i = 0; i < arr.length; i++) {
//            if(arr[i] == 69) {
//                System.out.println("Number Found: " + arr[i]);
//            }
//        }
    }

    static boolean search(int arr[], int target) {   // Method 2: Will return if the number exists
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                System.out.println("Number Found: " + arr[i]);
                return true;
            }
        }
        return false;
    }

    static int search2(int arr[], int goal){  // Method 3: Will return the index number of the existing number
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == goal){
                System.out.println("Number Found: " + arr[i]);
                return i;
            }
        }
        return -1;
    }
}

/*
Best Case: O(1) = it means it does not consider the size of the array and returns the output.
Since, the number lies on the zeroth index, it only makes a single comparison.
Worst Case O(n)
*/