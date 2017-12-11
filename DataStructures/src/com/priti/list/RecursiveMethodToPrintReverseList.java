package com.priti.list;

/**
 * Created by prguleri on 12/4/2017.
 */
public class RecursiveMethodToPrintReverseList {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        list.add(5);
        list.add(3);
        list.add(4);
        list.add(7);

        Node head = CustomLinkedList.getHead(list);

        recPrint(head);

    }

    private static void recPrint(Node head) {
        Node current = head;

        if(current ==null){
            return;
        }

        recPrint(current.getNextnode());
        System.out.println(current.getValue());
    }
}
