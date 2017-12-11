package com.priti.list;

/**
 * Created by prguleri on 9/5/2017.
 */
public class CustomLinkedList {
    public Node head;
    public Node old;
    public Node tail;

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        list.add(5);
        list.add(3);
        list.add(4);
        list.add(7);


        list.print();


    }

    public void add(int i) {
        Node n = new Node(i);

        if (head == null) {
            head = n;
            tail = n;
            return;
        }
        tail.setNextnode(n);
        tail = n;
    }

    public void print() {

        if (head == null) {
            return;
        }
        Node current = head;

        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNextnode();
        }

    }

    public void remove(int i) {
        Node current = head;
        Node previous = head;

        while (current != null) {
            if (current.getValue() == i) {
                previous.setNextnode(current.getNextnode());
                return;
            }
            previous = current;
            current = current.getNextnode();
        }
    }

    public void createLoop(CustomLinkedList list) {

        Node node = list.head;

        Node current = list.head;
        Node prev = list.head;

        while (current != null) {
            current = current.getNextnode();
        }

        prev.setNextnode(node);


    }

    public static Node getHead(CustomLinkedList list) {
        return list.head;
    }
    public void setHead(Node n){
        this.head = n;
    }
}
