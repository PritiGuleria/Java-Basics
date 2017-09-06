package com.priti;

/**
 * Created by prguleri on 9/6/2017.
 */
public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String s = "   Hello How    are you ?";

        char[] arr = s.toCharArray();
        int count =0;


        for(int i=0;i<s.length();i++){
            while(arr[i] == ' ') {
                for (int j = i; j < s.length() - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                count++;
            }

        }

        System.out.println(s);
        System.out.println(count);

        for(int k =0 ;k <s.length()-count;k++){
            System.out.print(arr[k]);
        }

    }
}
