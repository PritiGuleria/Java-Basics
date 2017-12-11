package com.priti.list;

/**
 * Created by prguleri on 12/4/2017.
 */
public class RemoveDup {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();


        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(7);
        list.add(7);


        removeDup(list);
        list.print();
    }

    private static void removeDup(CustomLinkedList list) {
        Node current  = CustomLinkedList.getHead(list);
        Node head = CustomLinkedList.getHead(list);

        while (current.getNextnode() !=null){
            if(current.getValue() == current.getNextnode().getValue()){
                current.setNextnode(current.getNextnode().getNextnode());
                if(current.getNextnode() ==null){
                    return;
                }
            }
            current= current.getNextnode();
        }
        list.setHead(head);
    }

}

