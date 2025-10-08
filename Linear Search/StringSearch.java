package com.sanika;

public class StringSearch {
    public static void main(String[] args) {
        String name = "Sanika";
        char target = 'k';
        System.out.println("Does the letter exist? : " + find(name, target));
    }

    static boolean find(String name, char target){
        if(name.isEmpty()){
            return false;
        }

        for(int i = 0; i < name.length(); i++){
            if(name.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
}
