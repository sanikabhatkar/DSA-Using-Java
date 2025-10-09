package com.sanika;

public class Comparison {
    public static void main(String[] args) {
        String a = "Kunal";
        String b = "Kunal";
        System.out.println(a == b);

        /* 2 */
        String a1 = new String("Sanika");
        String b1 = new String("Sanika");
        System.out.println(a1 == b1);

        System.out.println(a1.charAt(0));
    }
}

/*
Comparison of Strings
1) == Method
    if a -> Kunal b -> Kunal, then a == b gives false.
    if a -> b -> Kunal, then a ==b gives true.
2) In which case will the a and b be both Kunal with different objects, use the new keyword. Here, the objects are placed outside the pool but inside the heap.
3)
*/