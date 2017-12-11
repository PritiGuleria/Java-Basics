package com.priti.puzzels;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by prguleri on 9/6/2017.
 */
public class CountChars {

    public static void main(String[] args) {
        String s = "Stress";

        char[] arr = s.toCharArray();

        Map<Character,Integer> map =  new  HashMap<>();

        for(int i=0;i<=arr.length-1;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);

            }
            else {
            map.put(arr[i],1);}
        }

        Set<Map.Entry<Character, Integer>> set = map.entrySet();

        for(Map.Entry m:set){

            System.out.println(m.getKey()+ " "+ m.getValue() );
        }
    }
}
