package com.priti.list;

/**
 * Created by prguleri on 11/29/2017.
 */
public class CountOccOfInt {

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        list.add(12);
        list.add(7);
        list.add(12);
        list.add(79);
        list.add(12);
        list.add(12);

        count(7,list);
    }

    private static void count(int i, CustomLinkedList list) {
        Node current = CustomLinkedList.getHead(list);
        int count =0;

        while(current !=null){
            if(current.getValue()==i){
                count++;
            }
            current= current.getNextnode();
        }
        System.out.println(count);

    }
}
