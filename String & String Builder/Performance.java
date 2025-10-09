package com.sanika;

public class Performance {
    public static void main(String[] args) {
       String series = "" ;
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            System.out.print(ch);
            series = series + ch;
        }
        System.out.println("\n");
        System.out.println(series);

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println("String Builder Approach");
        System.out.println(builder);

        System.out.println("String Builder Reverse String");
        System.out.println(builder.reverse());
    }
}

/*
Time Complexity: If we have O((N^2 + N) / 2) -> here, the terms N and 2 are neglected.
Constants are always ignored.
N^2 + N -> (the most dominating term is always selected)
*/