package com.priti.array;

import java.util.Arrays;

/**
 * Created by prguleri on 11/27/2017.
 * 'a','b','c','d','e','f' = f,d,b
 */
public class AlternateReverse {
    public static void main(String[] args) {
        char[] c = new char[]{'a','b','c','d','e','f'};

        int end = c.length-1;

        for(int i=end;i>0;i-=2){
            System.out.println(c[i]);
        }



    }
}
