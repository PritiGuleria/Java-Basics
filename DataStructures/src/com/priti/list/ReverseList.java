package com.priti.list;

/**
 * Created by prguleri on 11/14/2017.
 */
public class ReverseList {

    public static void reverse(CustomLinkedList linkedList){
        Node current = linkedList.head;
        Node prev=null;
        Node next =null;

        while(current !=null){
            next =current.getNextnode();
            current.setNextnode(prev);
            prev =current;
            current=next;
        }

        linkedList.head = prev;

        linkedList.print();
    }

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.print();

        reverse(list);
    }
}
