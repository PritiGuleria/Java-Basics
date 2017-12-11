package com.priti.puzzels;

/**
 * Created by prguleri on 11/15/2017.
 */
public class Palindrome {
    public static void main(String[] args) {

        String s = "malaayalam";
        isPalindrome(s);


    }

    public static  boolean isPalindrome(String s){
        char[] arr = s.toCharArray();

        int start=0;
        int end = arr.length-1;

        while(start<end){
            if(arr[start] !=arr[end]){
                System.out.println("String is not palindrome");
                return false;
            }
            if(arr[start]==arr[end]){
                start++;
                end--;
            }


        }
        System.out.println("String is palindrome");
        return true;

    }
}
