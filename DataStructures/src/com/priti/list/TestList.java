package com.priti.list;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by prguleri on 9/6/2017.
 */
public class TestList {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(14);
        list.add(30);
        list.add(25);
        list.add(60);
        list.add(22);

        System.out.println(list);
        System.out.println(list.removeFirst());
    }
}
