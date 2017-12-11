package com.priti.list;

/**
 * Created by prguleri on 9/5/2017.
 */
public class Node {
    private int value;
    private Node nextnode;

    public Node(int value) {
        this.value = value;
    }

    public void setValue(int i){
        this.value =i;
    }


    public int getValue() {
        return value;
    }

    public Node getNextnode() {
        return nextnode;
    }

    public void setNextnode(Node nextnode) {
        this.nextnode = nextnode;
    }
}
