package com.priti.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by prguleri on 11/20/2017.
 */
public class CopyOnArrayListTest {

    public static void main(String[] args) {

        List list = new ArrayList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        ListIterator itr = list.listIterator();
        System.out.println(list);
        int count =0;

        while(itr.hasNext()){

            int val = (Integer) itr.next();
            count++;
            System.out.println("Count is "+ count);
            System.out.println(val);
            if(val==2){
                itr.add(15);
            }


        }

        System.out.println(list);






    }
}
