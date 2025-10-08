package com.sanika;

import java.util.Scanner;

public class ChangeName {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = input.next();
        Naamkaran(name);
        System.out.println(name);
    }

    static void Naamkaran(String naam){
        naam = "Kush Makwana"; /* Naam cannot be used anywhere else */
    }
}
/*
Logic of the Code:
- name(variable) = sanika(object)
- create a copy (sanika)
- copy(sanika) = naam(variable)
- name = naam = sanika(variables are pointing at the same object)
- naam = kush(pointing to the new object)
- printing (name) -> still pointing to sanika
- therefore sanika is printed
 */

/*
Primitives: int, short, char, byte (just passing value)
Objects: passing the value of the reference (variable).
 */
