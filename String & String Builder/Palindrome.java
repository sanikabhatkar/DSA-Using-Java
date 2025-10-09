package com.sanika;

public class Palindrome {
    public static void main(String[] args) {
        String str = "saas";
        StringBuilder pal = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            pal.append(str.charAt(i));
        }

        if(str.equals(pal.reverse().toString())){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}