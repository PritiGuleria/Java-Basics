package com.priti.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by prguleri on 11/8/2017.
 */
public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Priti");
        list.add("Pallu");
        list.add("Shobu");


        System.out.println(list);

        ListIterator<String> itr = list.listIterator(2);

        while(itr.hasNext()){
            System.out.println(itr.next());
            itr.add("newVal");

        }

        System.out.println("=======================");

        while(itr.hasPrevious()){
            System.out.println(itr.previous());
        }

    }
}
