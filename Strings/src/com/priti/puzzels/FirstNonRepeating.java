package com.priti.puzzels;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by prguleri on 9/30/2017.
 */
public class FirstNonRepeating {
    public static void main(String[] args) {
        String s = "Stress";
        s =s.toLowerCase();

        char[] arr = s.toCharArray();
        Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);}
        }

        Set<Map.Entry<Character,Integer>> set = map.entrySet();

        System.out.println(set);

        for(Map.Entry<Character,Integer> e :set){
            if((e.getValue()==1)){
                System.out.println(e.getKey());
                return;
            }
        }


    }
}
