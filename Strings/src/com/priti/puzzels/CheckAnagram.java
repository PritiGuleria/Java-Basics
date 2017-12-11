package com.priti.puzzels;

import java.util.Arrays;

/**
 * Created by prguleri on 11/20/2017.
 * Dormitory – Dirty Room
 * keep - peek - eekp
 */
public class CheckAnagram {

    private static void isAnagram(String s1, String s2){

        String s1Copy = s1.replaceAll(" ","");
        String s2copy = s2.replaceAll(" ","");

        char[] arr1 = s1Copy.toCharArray();


        char[] arr2 = s2copy.toCharArray();

        if(arr1.length != arr2.length){
            System.out.println("Not Anagram");
            return;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.println(s1+" and "+s2 +" are anagram");

        }
        else{
          System.out.println(s1+" and "+s2 +" are not anagram");
        }

    }

    public static void main(String[] args) {
        isAnagram("keep is","eepksi");
    }
}
