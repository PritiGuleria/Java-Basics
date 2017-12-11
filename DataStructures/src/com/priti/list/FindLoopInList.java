package com.priti.list;

/**
 * Created by prguleri on 11/22/2017.
 */
public class FindLoopInList {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.createLoop(list);

        Node fast = list.head;
        Node slow = list.head;

        while(slow.getNextnode()!=null && fast.getNextnode() !=null){
            slow=slow.getNextnode();
            fast=fast.getNextnode().getNextnode();
            if(slow==fast){
                System.out.println("There is loop");
                return;
            }
        }




    }
}
