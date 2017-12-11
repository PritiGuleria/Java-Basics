package com.priti.binaryTree;

/**
 * Created by prguleri on 12/1/2017.
 */
public class Node {
    private  int val;
    private Node left;
    private Node right;


    public Node(int val) {
        this.val = val;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getVal() {
        return val;
    }
}
