package com.priti.puzzels;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by prguleri on 9/24/2017.
 */
public class  RemoveDuplicates {
    public static void main(String[] args) {
        String s = "HHkjkksjjsdd";

        char[] arr= s.toCharArray();
        Map <Character,Integer> map = new HashMap<>();

            for(int i=0;i<arr.length;i++){
                if(map.containsKey(arr[i])){
                    map.put(arr[i],map.get(arr[i]+1));
                }
                map.put(arr[i],1);
            }

            Set<Character> set = map.keySet();

        for(char c: set){
            System.out.print(c);
        }
    }
}
