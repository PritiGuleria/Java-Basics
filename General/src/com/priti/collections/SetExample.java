package com.priti.collections;

import java.util.*;

/**
 * Created by prguleri on 11/8/2017.
 */
public class SetExample {
    public static void main(String[] args) {
        NavigableSet<String> set = new TreeSet<>();
        set.add("Priti");
        set.add("Pallu");
        set.add("Shobu");
        set.add("Sohi");
        System.out.println(set.add("Priti"));
        System.out.println(set.subSet("Priti","Sohi"));

        System.out.println(set);

        Map<String,Integer> map = new LinkedHashMap<>();
        map.put("Priti",1);
        map.put("Priti1",2);
        map.put("Priti2",3);
        map.put("Priti3",4);


        Set<Map.Entry<String,Integer>> set1 = map.entrySet();

        List<Map.Entry<String,Integer>> list = new ArrayList<>(set1);

        System.out.println(list);


    }
}
