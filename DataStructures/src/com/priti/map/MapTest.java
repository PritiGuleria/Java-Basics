package com.priti.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by prguleri on 9/14/2017.
 */
public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>(Comparator.reverseOrder());

        map.put(8, "Priti");
        map.put(4, "Priti");
        map.put(2, "Priti");
        map.put(54, "Priti");
        map.put(21, "Priti");
        map.put(11, "Priti");
        map.put(43, "Priti");

        System.out.println(map.keySet());


    }
}
