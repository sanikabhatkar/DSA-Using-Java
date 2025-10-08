package com.sanika;

import java.util.Scanner;

public class Conditions {
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your salary:");
        int salary = input.nextInt();
        /* If Else Condition */
        if (salary > 10000) {
            salary = salary + 2000;
            System.out.println("Salary is: " + salary);
        } else {
            salary = salary + 1000;
            System.out.println("Salary is: " + salary);
        }

        /* Multiple If Else : Concept remains same */
        if (salary < 10000) {
            salary = salary + 500;
            System.out.println("Salary is: " + salary);
        } else if (salary == 10000) {
            salary = salary + 1000;
            System.out.println("Salary is: " + salary);
        } else {
            salary = salary + 2000;
            System.out.println("Salary is: " + salary);
        }


    }
}
