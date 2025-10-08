package com.sanika;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun(2, 3, 5, 38, 87, 98, 34, 23, 65, 67); //add multiple inputs to the function.
        multiple(2, 6, "Sanika");
    }

    static void multiple(int a, int b, String...v){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }

    static void fun(int...v){
        System.out.println(Arrays.toString(v)); //Variable length argument is used when we do not know how many inputs will be considered.
    }
}
