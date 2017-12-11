
package com.priti.list;

import java.util.LinkedList;
import java.util.List;

import com.priti.list.CustomLinkedList;

/**
 * Created by prguleri on 9/8/2017.
 */

public class FindNthFromLast {


    public static void find(int i,CustomLinkedList linkedList){
        Node current = linkedList.head;
        Node temp =linkedList.head;
        for(int j=0;j<i;j++){
            temp =temp.getNextnode();
        }

        while (temp != null){
            current=current.getNextnode();
            temp=temp.getNextnode();
        }
        System.out.println(current.getValue());

    }

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.add(78);
        list.add(87);
        list.add(332);
        list.add(21);
        list.add(32);
        list.add(43);
        list.add(12);
        list.add(123);
        list.add(432);
        list.add(7438);
        list.add(10);

        list.print();


        System.out.println("================");

        find(4,list);





    }


}

