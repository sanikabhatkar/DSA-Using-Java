package com.sanika;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // this will add the ascii values of the letters.

        System.out.println("A" + "B"); // this will concatenate 2 letters, it is creating a new object called "ab", but it will be added to garbage collection if not stored.

        System.out.println((char)('a' + 3));
        System.out.println("a" + 1);
        System.out.println("Kunal" + new ArrayList<>());

        /*
        System.out.println(new Integer(value: 67) + new ArrayList<>());
        This will give an error.
        "+" : It can only be applied for Primitives and String.
        (Any one of the objects should be string)

        System.out.println(new Integer(value: 67) + "" + new ArrayList<>());
        This works because the middle object is a String.

         */
    }
}
