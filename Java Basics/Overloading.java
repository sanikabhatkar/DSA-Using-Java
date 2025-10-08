package com.sanika;

public class Overloading {
    public static void main(String[] args){
        fun(67);
        fun("Sanika");
        // if int is mentioned, it will execute the first method, if string then the second method.
        // as in, the function will be called based on the argument.
    }

    static void fun(int num){
        System.out.println(num);
        // same function name but different return type (int)
    }

    static void fun(String name){
        System.out.println(name);
        // same function name but different return type (string)
    }
}
