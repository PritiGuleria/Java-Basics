package com.priti.puzzels;

import java.util.Arrays;

/**
 * Created by prguleri on 9/6/2017.
 */
public class ReverseString {
    public static void main(String[] args) {
        String s = "PritiGuleria";

        char[] arr = s.toCharArray();
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        for (char c : arr) {
            System.out.print(c);
        }
    }

}
