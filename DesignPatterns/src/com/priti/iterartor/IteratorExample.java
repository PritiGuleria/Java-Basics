package com.priti.iterartor;

import java.util.Iterator;

/**
 * Created by prguleri on 9/14/2017.
 */
public class IteratorExample {
    public static void main(String[] args) {
        ItrCollection collection = new ItrCollection();

        collection.add("Priti");
        collection.add("Pallu");
        collection.add("Shobu");
        collection.add("Sohi");

        Iterator itr = collection.getIterartor();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        collection.remove(3);

        Iterator itr2 = collection.getIterartor();
        while (itr2.hasNext()){
            System.out.println("time 2");
            System.out.println(itr2.next());
        }
    }
}
