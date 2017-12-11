package com.priti.puzzels;

/**
 * Created by prguleri on 11/29/2017.
 */
public class ReverseStringUsingRecursion {
    public static void main(String[] args) {
        String s = "Priti";

        String n =reverseString(s);
        System.out.println(n);
    }

    private static String reverseString(String s) {
        if(s.isEmpty()){
            return s ;
        }
        return reverseString(s.substring(1))+s.charAt(0);
    }
}
