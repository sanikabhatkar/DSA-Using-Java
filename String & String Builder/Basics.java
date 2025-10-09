package com.sanika;

public class Basics {
    public static void main(String[] args) {
        String name = "Sanika Bhatkar";
        System.out.println(name);

        char name1 = 'a';
        System.out.println(name1);

        String name3 = "a, b";
        System.out.println(name3);

        /* 4 */
        String a = "Sanika";
        System.out.println(a);
        a = "Bhatkar";
        System.out.println(a);
    }
}

/*
String Theory:
1) String name = "Sanika Bhatkar"
   here,
     String: Datatype
     name: Reference Variable
     "Sanika Bhatkar": Object
   String is a "class" here.
2) String Pool: Pool is a separate memory structure inside the heap.
Example: String name = "Sanika", so "Sanika" is stored inside the pool.
Use Case = This enables optimality.
3) Strings are immutable [they are immutable for security reasons] (once written, it cannot be changed)
4) In this example, initially "a" has "Sanika" but in the next statement a new object is being created called "Bhatkar", the previous object gets added to garbage collection.
5) Why Immutable? Because if many people are named "Kunal" & one person decides to change the name, so the names of other people also get changed in the database.
*/