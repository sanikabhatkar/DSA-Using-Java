package com.sanika;

/* Switch Case Rules:
1) Cases have to be the same type as the expression.
2) Duplicate case values not allowed.
3) Break is used to terminate the sequence, if break not used it will continue to next case.
4) default is executed when any of the above case is not applicable
5) if default is not mentioned, but a break after it.
*/

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();

        switch(fruit){
            case "Mango":
                System.out.println("King of Fruits");
                break;
            case "Apple":
                System.out.println("Sweet Red Fruit");
                break;
            case "Orange":
                System.out.println("Fruit / Vegetable?");
                break;
            case "Grapes":
                System.out.println("Small Sweet Drops");
                break;
            default:
                System.out.println("Enter Valid Fruit!");
        }

        int day = input.nextInt();
        switch(day){
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }
    }
}
