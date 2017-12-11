package com.priti.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Created by prguleri on 10/4/2017.
 */
public class SetTes {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        System.out.println(set);
        set.add(12);
        set.add(null);

        System.out.println(set.contains(2));

        Set<Integer> set1 = Collections.emptySet();


           set1.add(12);

        ConcurrentMap<String,String> map = new ConcurrentHashMap<>();
        Set<String> s = Collections.newSetFromMap(new ConcurrentHashMap<>());
    }
}
