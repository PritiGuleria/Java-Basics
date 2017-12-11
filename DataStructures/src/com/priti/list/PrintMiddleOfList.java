package com.priti.list;

/**
 * Created by prguleri on 11/29/2017.
 */
public class PrintMiddleOfList {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        list.add(5);
        list.add(3);
        list.add(4);
        list.add(7);
        list.add(10);
        list.add(12);
        list.add(18);
        list.add(16);
        list.add(17);list.add(67);
        printMiddle2(list);
    }

    private static void printMiddle(CustomLinkedList list) {
        Node current = CustomLinkedList.getHead(list);
        Node current2 =CustomLinkedList.getHead(list);
        int count =0;

        while(current !=null){
            count++;
            current=current.getNextnode();
        }
        int mid = count/2;
        int index =0;

        while(current2 !=null){
            if(index==mid){
                System.out.println("Mid Value is: "+current2.getValue());
            }
            index++;
            current2 =current2.getNextnode();
        }
    }

    private static  void printMiddle2(CustomLinkedList list){
        Node slow = CustomLinkedList.getHead(list);
        Node fast = CustomLinkedList.getHead(list);

        while(fast.getNextnode()!= null && fast.getNextnode().getNextnode()!=null){
            fast = fast.getNextnode().getNextnode();
            slow= slow.getNextnode();
        }
        System.out.println(slow.getValue());
    }
}
