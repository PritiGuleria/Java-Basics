package com.priti.list;

/**
 * Created by prguleri on 11/27/2017.
 * Input:  10->15->12->13->20->14,  x = 12, y = 20
 * Output: 10->15->20->13->12->14
 * without changing data but swap nodes
 **/
public class SwapNodeLinks {

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.add(10);
        list.add(56);
        list.add(20);
        swapLinks(list,10,20);



    }

    private static void swapLinks(CustomLinkedList list, int val1, int val2) {
        Node head = CustomLinkedList.getHead(list);
        Node current = head;
        Node prev = head;
        Node x = null;
        Node xPrev=null;
        Node xNext =null;
        Node y = null;
        Node yPrev = null;
        Node yNext =null;

        while(current !=null){

            if(current.getValue()==val1){
                x=current;
                xPrev =prev;
                xNext = current.getNextnode();
            }
            if(current.getValue()==val2){
                y= current;
                yPrev = prev;
                yNext = current.getNextnode();
            }
            prev = current;
            current=current.getNextnode();

        }

        if(head==x && xNext==y){
            list.setHead(y);
            y.setNextnode(x);
            x.setNextnode(yNext);
        }
        else if(head == x) {
            list.setHead(y);
            y.setNextnode(xNext);
            yPrev.setNextnode(x);
            x.setNextnode(yNext);
        }
        else if(x.getNextnode() == y ){
            xPrev.setNextnode(y);
            y.setNextnode(x);
            x.setNextnode(yNext);
        }
        else {
            xPrev.setNextnode(y);
            y.setNextnode(xNext);
            yPrev.setNextnode(x);
            x.setNextnode(yNext);
        }
        list.print();

    }


}
