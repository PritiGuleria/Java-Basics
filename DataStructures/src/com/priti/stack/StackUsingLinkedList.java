package com.priti.stack;

/**
 * Created by prguleri on 11/17/2017.
 */
public class StackUsingLinkedList {

    private StackNode head;
    private StackNode last;

    public void push(int val){
        StackNode  n = new StackNode(val);

        if(head==null){
            head= n;
            last= n;
        }
        last.setNext(n);
        last=n;

    }

    public  int pop(){
        if(last==head){
            int k =head.getVal() ;
            head =null;
            return k;
        }
        StackNode current = head;
        StackNode prev = head;
        while (current !=last){
            prev=current;
            current=current.getNext();
        }
        int j= last.getVal();
        last=prev;
        return j;
    }




    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.push(23);
        stack.push(21);
        stack.push(298);
        stack.push(26);
        stack.push(211);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
       System.out.println(stack.pop());
        //System.out.println(stack.pop());


    }


    private static class StackNode{
        private int val;
        private StackNode next;

        StackNode(int val){
            this.val =val;
        }

        public int getVal() {
            return val;
        }


        public StackNode getNext() {
            return next;
        }

        public void setNext(StackNode next) {
            this.next = next;
        }
    }
}
