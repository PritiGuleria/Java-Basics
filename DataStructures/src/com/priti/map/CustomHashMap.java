package com.priti.map;

import com.priti.list.CustomLinkedList;

/**
 * Created by prguleri on 9/14/2017.
 */
public class CustomHashMap {

    private Node[] bucket;


    public CustomHashMap(){
        bucket = new Node[16];
    }


    public void put(int key,int value){

        insertVal(key,value);
    }

    private void insertVal(int key, int value) {
        int hash = getHash(key);
        int index = getIndex(hash);
        Node newVal = new Node(key,value);
        if(bucket[index] == null){
            bucket[index] = newVal;

        }
        else{
            Node current = bucket[index];
            Node prev = bucket[index];

            while(current !=null){
                if(current.getValue()==newVal.getValue()){
                    current.setValue(newVal.getValue());
                    return;
                }
                prev =current;
                current =current.getNext();
            }

            prev.setNext(newVal);
        }


    }


    public void printAll(){
        for (Node node : bucket) {
            if (node != null) {
                traverseList(node);
            }
        }
    }

    private void traverseList(Node node) {
        Node current = node;

        while(current!=null){
            System.out.println(current.getKey()+" " + current.getValue());
            current =current.getNext();
        }
    }


    public void remove(int key){

        int hash = getHash(key);
        int index = getIndex(hash);

        Node head = bucket[index];

        if(head.getKey()==key){
            bucket[index]=head.getNext();
            return;
        }
        Node current =bucket[index];
        Node prev = bucket[index];

        while (current !=null){
            if(current.getKey()==key){
                prev.setNext(current.getNext());
            }
            prev=current;
            current=current.getNext();
        }

    }

    private int getIndex(int hash) {
        return (hash%bucket.length);
    }

    private int getHash(int key) {
        return  (key*10)/4;
    }


    private class Node{
        private int key;
        private int value;
        private Node next;

        public Node( int key,int value){
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}

