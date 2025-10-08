package com.sanika;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* ArrayList <datatype> variable name = new ArrayList <> */
        ArrayList<Integer> list = new ArrayList<>(10); /* Here, Integer is not a primitive, it is a wrapper class */
        list.add(67);
        list.add(5);
        list.add(84203);
        list.add(273);
        list.add(59);

        System.out.println(list.contains(67));
        list.set(0, 99);
        list.remove(2);

        System.out.println(list);

        // Input
        for(int i = 0; i < 6; i++){
            list.add(input.nextInt());
        }

        for(int i = 0; i < 6; i++){
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }
}

/*
1) Size is fixed internally.
2) ArrayList fills by the same amount
3) It doubles & creates a new list.
 */