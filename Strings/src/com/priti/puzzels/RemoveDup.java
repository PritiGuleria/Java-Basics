package com.priti.puzzels;

import java.util.Arrays;

/**
 * Created by prguleri on 11/21/2017.
 */
public class RemoveDup {
    public static void main(String[] args) {

        String s = "HHkjkkhj";
        s= s.toLowerCase();

        char[] arr= s.toCharArray();
        char[] result = new char[arr.length];
        Arrays.sort(arr);
        char c = arr[0];
        result[0] =c;
        int index=0;



        for(int i=1;i<s.length();i++){
            while((i<s.length() )&&(arr[i]== result[index])){
                i++;
            }
            if(i<s.length()) {
                result[++index] = arr[i];
            }
        }

        System.out.println(result);




    }
}
