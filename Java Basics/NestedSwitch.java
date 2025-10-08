package com.sanika;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int empID = input.nextInt();
        String department = input.next();

        switch(empID){
            case 1:
                System.out.println("Sanika Bhatkar");
                break;
            case 2:
                System.out.println("Kush Makwana");
                break;
            case 3:
                System.out.println("Employee Number 3");
                switch(department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Sales":
                        System.out.println("Sales Department");
                        break;
                    default:
                        System.out.println("No Department Entered");
                }
                break;
            default:
                System.out.println("Enter Correct ID");
        }
    }
}
