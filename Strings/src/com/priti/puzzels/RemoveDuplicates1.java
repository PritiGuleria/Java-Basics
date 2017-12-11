package com.priti.puzzels;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by prguleri on 11/18/2017.
 */
public class RemoveDuplicates1 {


    public static void main(String[] args) {
        String s = "HHkjdskjkjjasd";

        char[] arr = s.toCharArray();

        Set<Character> set = new LinkedHashSet<>();

        for(int i =0;i<arr.length;i++){
            set.add(arr[i]);
        }

        System.out.println(set);

    }
}
