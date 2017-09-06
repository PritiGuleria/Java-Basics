package com.priti.list;

/**
 * Created by prguleri on 9/6/2017.
 */
public class TestList {

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        list.add(56);
        list.add(54);
        list.add(89);



        list.printAll();

       // list.remove(23);

        System.out.println("==================");


        CustomLinkedList.reverseList(list);

        list.printAll();

        System.out.println("=============");
        CustomLinkedList.createLoop(list);
        System.out.println( CustomLinkedList.checkLoop(list));
    }
}
