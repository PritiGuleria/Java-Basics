package com.priti.puzzels;

/**
 * Created by prguleri on 11/22/2017.
 */
public class RemoveDup1 {
    public static void main(String[] args) {
        String s = "psppk";

        char[] arr = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = ' ';
                }
            }
        }

        System.out.println(arr);
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            while (arr[i] == ' ' && count<s.length()) {
                count++;
                for (int j = i; j < s.length() - 1; j++) {
                    arr[j] = arr[j + 1];
                }
            }
        }
        System.out.println(count);

        System.out.println(arr);
    }
}
