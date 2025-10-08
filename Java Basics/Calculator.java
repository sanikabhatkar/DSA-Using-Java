package com.sanika;

import java.util.Scanner;

public class Calculator {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ans = 0;
        while(true){
            System.out.println("Enter operator: ");
            char op = input.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter Number 1:");
                int a = input.nextInt();
                System.out.println("Enter Number 2:");
                int b = input.nextInt();

                if (op == '+'){
                    ans = a + b;
                }
                if (op == '-') {
                    ans = a - b;
                }
                if (op == '*') {
                    ans = a * b;
                }
                if (op == '/') {
                    ans = a / b;
                }
                if (op == '%') {
                    ans = a % b;
                }
            } else if (op == 'x' || op == 'X') {
                break;
            }

            else {
                System.out.println("Invalid");
            }

            System.out.println(ans);
        }
    }
}