package com.sanika;

import java.util.Arrays;

public class Methods {
    static void main(String[] args) {
        String name = "Sanika Bhatkar";
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println("          Sanika          ".strip());
        // removes any spaces present in the string

        System.out.println(name.indexOf('a'));
        System.out.println(Arrays.toString(name.split(" ")));
    }
}

/*
Here, toCharArray -> used to convert the characters into an array, and Arrays.toString is used to display it in an array format.
*/