package com.priti.puzzels;

/**
 * Created by prguleri on 10/31/2017.
 */

/*e:g
Priti Guleria : itirP aireluG
 */
public class ReverseEachWord {

    public static void main(String[] args) {
        String s = "Priti Guleria";

        String[] arr  = s.split(" ");

        for(String s1 :arr){
            char[] chars = s1.toCharArray();
            int start =0;
            int end =s1.length()-1;
            while(start<end){
                char temp = chars[start];
                chars[start] =chars[end];
                chars[end] =temp;
                start++;
                end--;
            }

            for(char c:chars){
            System.out.print(c);}
            System.out.print( " ");

        }




    }
}
