package com.sanika;

public class Shadowing {
    static int x = 90; // this will be available for a particular {} curly braces, here the curly braces after shadowing
    public static void main(String[] args){
        System.out.println(x);
        int x = 40; //the class variable is getting shadowed by this line
        System.out.println(x); //here the value is 40 because int x = 40 is only initialized in this block.
        fun();
    }

    static void fun(){
        System.out.println(x); //here x is referring to the one mentioned in the very beginning
    }
}
