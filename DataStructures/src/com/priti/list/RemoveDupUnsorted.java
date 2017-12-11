package com.priti.list;

/**
 * Created by prguleri on 12/4/2017.
 */
public class RemoveDupUnsorted {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        list.add(5);
        list.add(7);
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(7);
        list.add(7);

        removeDup(list);

    }

    private static void removeDup(CustomLinkedList list) {
        Node current = CustomLinkedList.getHead(list);


        while (current !=null){
            Node second = current.getNextnode();
            Node secPrev = current;
            while(second !=null){
                if (current.getValue() == second.getValue()){
                    secPrev.setNextnode(second.getNextnode());
                    second.setNextnode(null);
                    second = secPrev;
                }
                secPrev = second;
                second=second.getNextnode();
            }
            current= current.getNextnode();
        }

       list.print();
    }
}

